package me.yuluowo.events;

import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatMessage {

    @SubscribeEvent
    public void miningBoost(ClientChatReceivedEvent event){
        String message = event.message.getFormattedText();
        if(message.equals("Mining Speed Boost is now available.")){
            Minecraft.getMinecraft().ingameGUI.displayTitle(EnumChatFormatting.RED + "Mining Boost Ready !", "", 0, 0, 0);
        }
    }

}
