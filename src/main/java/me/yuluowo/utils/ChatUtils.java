package me.yuluowo.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class ChatUtils {

    public static void send(String content){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer != null){
            mc.thePlayer.addChatComponentMessage(new ChatComponentText(content));
        }
    }

}
