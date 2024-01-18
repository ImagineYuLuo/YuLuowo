package me.yuluowo;

import me.yuluowo.commands.Config;
import me.yuluowo.commands.PartyTransfer;
import me.yuluowo.commands.DisplayItemName;
import me.yuluowo.commands.WayPoints;
import me.yuluowo.commands.macros.Mining;
import me.yuluowo.commands.warp.JoinDungeons;
import me.yuluowo.commands.warp.WarpCommand;
import me.yuluowo.events.ChatMessage;
import me.yuluowo.module.macros.MiningMacro;
import me.yuluowo.renders.RenderUtils;
import net.minecraft.client.gui.GuiScreen;
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

    public static GuiScreen gui = null;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ChatMessage());
        MinecraftForge.EVENT_BUS.register(new RenderUtils());
        MinecraftForge.EVENT_BUS.register(new Config());
        MinecraftForge.EVENT_BUS.register(new MiningMacro());

        ClientCommandHandler.instance.registerCommand(new Config());
        ClientCommandHandler.instance.registerCommand(new JoinDungeons());
        ClientCommandHandler.instance.registerCommand(new WarpCommand());
        ClientCommandHandler.instance.registerCommand(new PartyTransfer());
        ClientCommandHandler.instance.registerCommand(new DisplayItemName());
        ClientCommandHandler.instance.registerCommand(new Mining());

        ClientCommandHandler.instance.registerCommand(new WayPoints.getWayPoints());
    }
}
