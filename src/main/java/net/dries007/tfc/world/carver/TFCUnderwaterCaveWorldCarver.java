package net.dries007.tfc.world.carver;

import com.mojang.datafixers.Dynamic;
import net.dries007.tfc.objects.types.RockManager;
import net.minecraft.block.Block;
import net.minecraft.world.gen.carver.UnderwaterCaveWorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;

import java.util.Set;
import java.util.function.Function;

public class TFCUnderwaterCaveWorldCarver extends UnderwaterCaveWorldCarver
{
    private final Set<Block> originalCarvableBlocks;

    public TFCUnderwaterCaveWorldCarver(Function<Dynamic<?>, ? extends ProbabilityConfig> dynamic)
    {
        super(dynamic);
        originalCarvableBlocks = carvableBlocks;

        // Need to run this every time the rock registry is reloaded
        RockManager.INSTANCE.addCallback(() -> carvableBlocks = TFCWorldCarvers.fixCarvableBlocksList(originalCarvableBlocks));
    }
}