package me.yuluowo.commands;

import me.yuluowo.utils.ChatUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.EnumChatFormatting;

public class PartyTransfer extends CommandBase {


    @Override
    public String getCommandName() {
        return "pt";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(args.length == 0){
            ChatUtils.send(EnumChatFormatting.RED + "/pt <name>");
        }else {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/party transfer " + args[0]);
        }
    }

    //Giving Permission To Use Commands
    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }
}
