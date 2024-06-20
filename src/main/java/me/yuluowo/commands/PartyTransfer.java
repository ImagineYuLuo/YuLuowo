package me.yuluowo.commands;

import me.yuluowo.utils.ChatUtils;
import me.yuluowo.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.EnumChatFormatting;

public class PartyTransfer extends CommandBase {

    @Override
    public String getCommandName() {
        return "ptr";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(Utils.isOnHypixel()){
            if(args.length == 0){
                ChatUtils.send(EnumChatFormatting.RED + "/ptr <name>");
            }else {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/party transfer " + args[0]);
            }
        }else{
            ChatUtils.send(EnumChatFormatting.RED + "You are not in hypixel.");
        }
    }

    //Giving Permission To Use Commands
    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }
}
