package me.yuluowo.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumChatFormatting;

public class Utils {

    private static final Minecraft mc = Minecraft.getMinecraft();

    public static boolean isOnHypixel(){
        if(mc != null && mc.theWorld != null && !mc.isSingleplayer()){
            return mc.getCurrentServerData().serverIP.equalsIgnoreCase("hypixel");
        }
        return false;
    }

    public static boolean isOnSkyblock(){
        if(mc.theWorld != null && isOnHypixel()){
            Scoreboard scoreboard = mc.theWorld.getScoreboard();
            ScoreObjective scoreObjective = scoreboard.getObjectiveInDisplaySlot(1);
            String title = EnumChatFormatting.getTextWithoutFormattingCodes(scoreObjective.getDisplayName());
            return title.equals("SKYBLOCK");
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
        return mc.thePlayer.getHeldItem().getDisplayName();
    }






}
