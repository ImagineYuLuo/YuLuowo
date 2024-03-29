package me.yuluowo.commands;

import me.yuluowo.module.macros.finder.BlockFinder;
import me.yuluowo.utils.ChatUtils;
import me.yuluowo.utils.ItemUtils;
import me.yuluowo.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;

public class DisplayItemName extends CommandBase {

    private static final Minecraft mc = Minecraft.getMinecraft();

    private static int playerX;
    private static int playerY;
    private static int playerZ;

    @Override
    public String getCommandName() {
        return "display";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(ItemUtils.heldItem() != null){
            Minecraft mc = Minecraft.getMinecraft();
            ChatUtils.send(EnumChatFormatting.GOLD + mc.thePlayer.getName() +
                    EnumChatFormatting.WHITE + " is holding " +
                    EnumChatFormatting.GRAY + "[" +
                    EnumChatFormatting.AQUA + ItemUtils.heldItem() +
                    EnumChatFormatting.GRAY + "]" +
                    EnumChatFormatting.GOLD + " right now.");
        }else{
            ChatUtils.send(EnumChatFormatting.RED + "You don't hold the item.");
        }
    }

    //Giving Permission To Use Commands
    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }

}
