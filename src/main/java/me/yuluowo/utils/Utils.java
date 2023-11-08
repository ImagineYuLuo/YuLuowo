package me.yuluowo.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;

public class Utils {

    public static boolean isOnHypixel(){
        Minecraft mc = Minecraft.getMinecraft();
        //mc.thePlayer.getHeldItem().getDisplayName()
        if(mc != null && mc.theWorld != null && !mc.isSingleplayer()){
            return mc.getCurrentServerData().serverIP.toLowerCase().contains("hypixel");
        }
        return false;
    }

    public static String[] rarityArrays = new String[]{
        "COMMON",
        "UNCOMMON",
        "RARE",
        "EPIC",
        "LEGENDARY",
        "MYTHIC",
        "DIVINE",
        "SPECIAL",
        "VERY SPECIAL"
    };

    public static String[] rarityArraysColor = new String[]{
        EnumChatFormatting.WHITE + EnumChatFormatting.BOLD.toString() + "COMMON",
        EnumChatFormatting.GREEN + EnumChatFormatting.BOLD.toString() + "UNCOMMON",
        EnumChatFormatting.BLUE + EnumChatFormatting.BOLD.toString() + "RARE",
        EnumChatFormatting.DARK_PURPLE + EnumChatFormatting.BOLD.toString() + "EPIC",
        EnumChatFormatting.GOLD + EnumChatFormatting.BOLD.toString() + "LEGENDARY",
        EnumChatFormatting.LIGHT_PURPLE + EnumChatFormatting.BOLD.toString() + "MYTHIC",
        EnumChatFormatting.AQUA + EnumChatFormatting.BOLD.toString() + "DIVINE",
        EnumChatFormatting.RED + EnumChatFormatting.BOLD.toString() + "SPECIAL",
        EnumChatFormatting.RED + EnumChatFormatting.BOLD.toString() + "VERY SPECIAL"
    };

    public static String heldItem(){
        return Minecraft.getMinecraft().thePlayer.getHeldItem().getDisplayName();
    }






}
