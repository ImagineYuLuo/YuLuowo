package me.yuluowo.commands;

import me.yuluowo.utils.ChatUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;

public class WayPoints {

    static int playerX, playerY, playerZ;

    public static void showWayPoints(Boolean Enable){

    }

    public static class getWayPoints extends CommandBase {

        @Override
        public String getCommandName() {
            return "waypoint";
        }

        @Override
        public String getCommandUsage(ICommandSender sender) {
            return "/" + getCommandName();
        }

        @Override
        public void processCommand(ICommandSender sender, String[] args) throws CommandException {
            if(args.length == 0){
                //set waypoint here (x, y, z)
                BlockPos blockPos = Minecraft.getMinecraft().thePlayer.getPosition();
                playerX = blockPos.getX();
                playerY = blockPos.getY();
                playerZ = blockPos.getZ();

            }else switch (args[0]){
                case "help":
                    //help
                    break;
                case "on":
                case "enable":
                    showWayPoints(true);
                    break;
                case "off":
                case "disable":
                    showWayPoints(false);
                    break;
                default:
                    ChatUtils.send(EnumChatFormatting.RED + "Unknown Command ...");
            }
        }

        @Override
        public int getRequiredPermissionLevel(){
            return 0;
        }
    }
}
