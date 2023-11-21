package me.yuluowo.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;


import java.io.IOException;

public class YuLuowoGui extends GuiScreen {

    private GuiButton btn_OnOff;
    private GuiButton btn_Close;

    private static final int btn_width = 100;
    private static final int btn_height = 20;

    @Override
    public void initGui() {
        ScaledResolution resolution = new ScaledResolution(Minecraft.getMinecraft());
        this.width = resolution.getScaledWidth();
        this.height = resolution.getScaledHeight();
        int x = (this.width) / 2;
        int y = (this.height) / 2;

        this.buttonList.add(btn_OnOff = new GuiButton(0, x - btn_width / 2, y - btn_height / 2 + 50, btn_width, btn_height, "On"));
        this.buttonList.add(btn_Close = new GuiButton(1, x - btn_width / 2, y - btn_height / 2, btn_width, btn_height, "Close"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button == btn_Close) {
            mc.thePlayer.closeScreen();
        }else if (button == btn_OnOff) {
            btn_OnOff.displayString = ((btn_OnOff.displayString.equals("On")) ? "Off" : "On");
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
        return false;
    }
}
