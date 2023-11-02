package me.yuluowo.events;

import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatMessage {

    @SubscribeEvent
    public void onChatMessage(ClientChatReceivedEvent event){
        String message = event.message.getUnformattedText().toLowerCase();
        if(message.contains("your mining speed boost has expired!")){
            Minecraft.getMinecraft().ingameGUI.displayTitle(EnumChatFormatting.RED + "Mining Ability Has Expired !", "", 0, 0, 0);
        }
    }


}
