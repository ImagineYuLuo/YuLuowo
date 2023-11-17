package me.yuluowo.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

import java.awt.*;
import java.io.IOException;

public class YuLuowoGui extends GuiScreen {

    private GuiButton btn_Close;

    @Override
    public void initGui() {
        super.initGui();
        // drawRect mean background
        this.buttonList.add(btn_Close = new GuiButton(0, 300, 300, "Close"));
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button == btn_Close){
            mc.thePlayer.closeScreen();
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }


    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return true;
    }
}
