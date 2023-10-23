package me.yuluowo;

import me.yuluowo.commands.warp.WarpCommand;
import me.yuluowo.events.chat.JoinDungeons;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = YuLuo.MOD_ID,name = YuLuo.MOD_NAME, version = YuLuo.VERSION, useMetadata=true)
public class YuLuo {

    // YuLuoAddons --- Created By YuLuo ---
    public static final String MOD_ID = "yuluomod";
    public static final String MOD_NAME = "YuLuoMod";
    public static final String VERSION = "1.8.9";


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new JoinDungeons());

        ClientCommandHandler.instance.registerCommand(new WarpCommand());
    }
}
