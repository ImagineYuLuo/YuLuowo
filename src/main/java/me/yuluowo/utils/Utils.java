package me.yuluowo.utils;

import net.minecraft.client.Minecraft;

public class Utils {

    public static boolean isOnHypixel(){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc != null && mc.theWorld != null && !mc.isSingleplayer()){
            return mc.getCurrentServerData().serverIP.toLowerCase().contains("hypixel");
        }
        return false;
    }

}
