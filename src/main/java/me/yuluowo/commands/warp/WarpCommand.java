package me.yuluowo.commands.warp;

import me.yuluowo.utils.ChatUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class WarpCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "warp";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/warp";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args)  {
        if(args.length == 0){
            ChatUtils.send("/warp dg(dungeons), cr(crimson)");
        }else switch (args[0]){
            case "dg":
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/warp dungeons");
                break;
            case "cr":
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/warp crimson");
                break;
        }
    }

    //Giving Permission To Use Commands
    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }
}
