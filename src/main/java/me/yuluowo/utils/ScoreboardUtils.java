package me.yuluowo.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoreboardUtils {
    private static final List<Location> locationNameList = new ArrayList<>(Arrays.asList(Location.ISLAND, Location.GUEST_ISLAND));
    private static final Minecraft mc = Minecraft.getMinecraft();

    public static boolean getCurrentLocation(String locationName){
        if(Utils.isOnHypixel() && Utils.isOnSkyblock()){
            Scoreboard scoreboard = mc.theWorld.getScoreboard();
            ScoreObjective scoreObjective = scoreboard.getObjectiveInDisplaySlot(1);
            return scoreObjective.getDisplayName().equals(locationName);
        }
        return false;
    }

}
