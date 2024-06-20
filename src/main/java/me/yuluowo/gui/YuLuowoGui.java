package me.yuluowo.gui;

import me.yuluowo.gui.elements.GButton;
import me.yuluowo.renders.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;


import java.awt.*;
import java.io.IOException;

public class YuLuowoGui extends GuiScreen {

    private GuiButton buttonOnOff;
    private GuiButton buttonClose;

    private static final int buttonWidth = 100;
    private static final int buttonHeight = 20;

    private final int scale = 70;

    @Override
    public void initGui() {
        ScaledResolution resolution = new ScaledResolution(Minecraft.getMinecraft());
        this.width = resolution.getScaledWidth();
        this.height = resolution.getScaledHeight();
        int x = (this.width) / 2;
        int y = (this.height) / 2;
        this.buttonList.add(buttonOnOff = new GuiButton(0, x - buttonWidth / 2, y - buttonHeight / 2 + 50, buttonWidth, buttonHeight, "On"));
        this.buttonList.add(buttonClose = new GuiButton(1, x - buttonWidth / 2, y - buttonHeight / 2, buttonWidth, buttonHeight, "Close"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button == buttonClose) {
            mc.thePlayer.closeScreen();

        }else if (button == buttonOnOff) {
            buttonOnOff.displayString = ((buttonOnOff.displayString.equals("On")) ? "Off" : "On");
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        Gui.drawRect(scale, scale, width - scale, height - scale, new Color(0, 0, 0, 150).getRGB());
        RenderUtils.drawRect();
        super.drawScreen(mouseX, mouseY, partialTicks);
        RenderUtils.drawFontCenter("YuLuoAddons", width / 2, scale, 0xFFFFFF);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
