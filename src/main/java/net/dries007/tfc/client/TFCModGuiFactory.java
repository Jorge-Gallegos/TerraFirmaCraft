package net.dries007.tfc.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;

import java.util.Set;

import static net.dries007.tfc.Constants.MOD_ID;
import static net.dries007.tfc.Constants.MOD_NAME;

@SuppressWarnings("unused")
public class TFCModGuiFactory implements IModGuiFactory
{
    @Override
    public void initialize(Minecraft minecraftInstance)
    {

    }

    @Override
    public boolean hasConfigGui()
    {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parentScreen)
    {
        return new TFCModGui(parentScreen);
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }

    public final class TFCModGui extends GuiConfig
    {
        public TFCModGui(GuiScreen parentScreen)
        {
            super(parentScreen, MOD_ID, MOD_NAME);
        }
    }
}