package me.yuluowo.events.chat;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JoinDungeons {

    @SubscribeEvent
    public void getChatText(ClientChatReceivedEvent event){
        Pattern normalMode = Pattern.compile("!F", Pattern.CASE_INSENSITIVE);
        //Pattern masterMode = Pattern.compile("!M", Pattern.CASE_INSENSITIVE);

        String msg = event.message.getUnformattedText();
        Matcher normalMatcher = normalMode.matcher(msg);
        boolean matchFound = normalMatcher.find();

        if(matchFound){
            String[] Floor = msg.split("");
            for(int i=1;i<Floor.length;i++){
                String s = Floor[i-1] + Floor[i];
                if(s.equals("!F")){
                    int dungeonsFloor = Integer.parseInt(Floor[i+1]);
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/joindungeon catacombs " + dungeonsFloor);
                    break;
                }
            }
        }

    }

}
