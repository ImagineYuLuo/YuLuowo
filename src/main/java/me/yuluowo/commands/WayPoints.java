package me.yuluowo.commands;

import me.yuluowo.utils.ChatUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;

public class WayPoints {

    public static int playerX, playerY, playerZ;
    static int checkNumber = 0;

    public static boolean showWayPoint(){
        // 1 = Enable, 0 = Disbale
        return checkNumber == 1;
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
                Minecraft mc = Minecraft.getMinecraft();
                BlockPos blockPos = mc.thePlayer.getPosition();
                playerX = blockPos.getX();
                playerY = blockPos.getY();
                playerZ = blockPos.getZ();
                checkNumber = 1;
                //System.out.println(playerX + " " + playerY + " " + playerZ);
            }else switch (args[0]){
                case "help":
                    //help
                    ChatUtils.send("===== WayPoint =====\n" +
                            "/waypoint (Set the current player's position.)\n" +
                            "/waypoint on / enable (Show your setting waypoint gui.)\n" +
                            "/waypoint off / disable (Close your setting waypoint gui.)");
                    break;
                case "on":
                case "enable":
                    checkNumber = 1;
                    ChatUtils.send("Show the waypoint!");
                    break;
                case "off":
                case "disable":
                    checkNumber = 0;
                    ChatUtils.send("Close the waypoint!");
                    break;
                default:
                    ChatUtils.send("Unknown Command ...");
            }
        }

        @Override
        public int getRequiredPermissionLevel(){
            return 0;
        }

    }



}
