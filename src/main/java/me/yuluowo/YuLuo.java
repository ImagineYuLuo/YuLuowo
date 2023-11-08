package me.yuluowo;

import me.yuluowo.commands.PartyTransfer;
import me.yuluowo.commands.DisplayItemName;
import me.yuluowo.commands.WayPoints;
import me.yuluowo.commands.warp.JoinDungeons;
import me.yuluowo.commands.warp.WarpCommand;
import me.yuluowo.events.ChatMessage;
import me.yuluowo.renders.RenderUtils;
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
        MinecraftForge.EVENT_BUS.register(new ChatMessage());
        MinecraftForge.EVENT_BUS.register(new RenderUtils());

        ClientCommandHandler.instance.registerCommand(new WayPoints.getWayPoints());
        ClientCommandHandler.instance.registerCommand(new JoinDungeons());
        ClientCommandHandler.instance.registerCommand(new WarpCommand());
        ClientCommandHandler.instance.registerCommand(new PartyTransfer());
        ClientCommandHandler.instance.registerCommand(new DisplayItemName());
    }
}
