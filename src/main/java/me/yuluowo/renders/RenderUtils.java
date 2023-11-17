package me.yuluowo.renders;

import me.yuluowo.commands.WayPoints;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class RenderUtils {

    @SubscribeEvent
    public void onRenderTick(TickEvent.RenderTickEvent event){
        int x = WayPoints.playerX;
        int y = WayPoints.playerY;
        int z = WayPoints.playerZ;
        Minecraft mc = Minecraft.getMinecraft();
        FontRenderer fontRenderer = mc.fontRendererObj;
        if(mc.theWorld != null){
            if(WayPoints.showWayPoint()){
                fontRenderer.drawString("Waypoint set at : " + x + " " + y + " " + z, 5, 5, 0);
            }else {
                fontRenderer.drawString(null, 5, 5, 0);

            }
        }
    }

}
