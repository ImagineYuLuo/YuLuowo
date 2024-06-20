package me.yuluowo.renders;

import me.yuluowo.commands.WayPoints;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.GL11;

public class RenderUtils {

    private static final Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void onRenderTick(TickEvent.RenderTickEvent event){
        int x = WayPoints.playerX;
        int y = WayPoints.playerY;
        int z = WayPoints.playerZ;
        FontRenderer fontRenderer = mc.fontRendererObj;
        if(mc.theWorld != null){
            if(WayPoints.showWayPoint()){
                fontRenderer.drawString("Waypoint set at : " + x + " " + y + " " + z, 5, 5, 0);
            }else {
                fontRenderer.drawString(null, 5, 5, 0);
            }
        }
    }

    public static void drawFontCenter(String text, int x, int y, int color){
        FontRenderer fontRenderer = mc.fontRendererObj;
        int halfWidth = fontRenderer.getStringWidth(text) / 2;
        fontRenderer.drawString(text, x - halfWidth, y, color);
    }

    public static void drawRect() {
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        GlStateManager.color(150, 0, 0, 100);
        worldRenderer.pos(10, 10, 10);
        tessellator.draw();
    }

}
