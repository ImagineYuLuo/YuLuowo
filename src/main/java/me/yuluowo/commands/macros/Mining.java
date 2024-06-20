package me.yuluowo.commands.macros;

import me.yuluowo.module.macros.MiningMacro;
import me.yuluowo.utils.ChatUtils;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.EnumChatFormatting;

public class Mining extends CommandBase {

    @Override
    public String getCommandName() {
        return "mining";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(args.length == 0){
            ChatUtils.send("too few arguments");
        }else switch (args[0]){
            case "on":
                MiningMacro.checkPickaxeInHotbar = true;
                break;
            case "off":
                MiningMacro.checkPickaxeInHotbar = false;
                break;
            default:
                ChatUtils.send("Unknown command");
        }
    }

    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }
}
