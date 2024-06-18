package me.yuluowo;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = YuLuo.MOD_ID,name = YuLuo.MOD_NAME, version = YuLuo.VERSION, useMetadata=true)
public class YuLuo {

    // YuLuoAddons --- Created By YuLuo ---
    public static final String MOD_ID = "yuluomod";
    public static final String MOD_NAME = "YuLuoMod";
    public static final String VERSION = "1.8.9";

    public static GuiScreen gui = null;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
