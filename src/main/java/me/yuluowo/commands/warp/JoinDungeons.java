package me.yuluowo.commands.warp;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class JoinDungeons extends CommandBase {

    @Override
    public String getCommandName() {
        return "j";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/j";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(args.length == 0){
            sender.addChatMessage(new ChatComponentText("/j [dungeons floor], ex: /j f7"));
        }else {
            String dungeonMode = "catacombs";
            if(args[0].startsWith("m")){
                dungeonMode = "master_catacombs";
            }
            String cmd = "/joindungeon" + dungeonMode + " " + args[0].substring(1).toLowerCase();
            Minecraft.getMinecraft().ingameGUI.displayTitle(EnumChatFormatting.RED + "Entering " + args[0].toLowerCase(), "", 0, 0, 0);
            Minecraft.getMinecraft().thePlayer.sendChatMessage(cmd);
        }
    }

    //Giving Permission To Use Commands
    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }
}
