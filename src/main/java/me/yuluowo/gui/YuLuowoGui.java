package me.yuluowo.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;

import java.io.IOException;

public class YuLuowoGui extends GuiScreen {

    private GuiButton btn_Close;

    @Override
    public void initGui() {
        super.initGui();
        // drawRect mean background
        ScaledResolution resolution = new ScaledResolution(Minecraft.getMinecraft());
        this.width = resolution.getScaledWidth();
        this.height = resolution.getScaledHeight();
        int x = (this.width) / 2;
        int y = (this.height) / 2;
        this.buttonList.add(btn_Close = new GuiButton(0, 5, 5, 80, 20, "Close"));
        //this.buttonList.add(btn_Close = new GuiButton(0, x - 200 / 2, y - 20 / 2, "Close"));
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
