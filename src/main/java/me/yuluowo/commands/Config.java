package me.yuluowo.commands;

import me.yuluowo.gui.YuLuowoGui;
import me.yuluowo.utils.ChatUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Config extends CommandBase {

    private GuiScreen mod;
    public static boolean openGui = false;

    @Override
    public String getCommandName() {
        return "gui";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(sender instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) sender;
            openGui = true;
            ChatUtils.send("Open Menu");
        }
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event){
        if(Config.openGui){
            Config.openGui = false;
            Minecraft.getMinecraft().displayGuiScreen(new YuLuowoGui());
        }
    }

    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }
}
