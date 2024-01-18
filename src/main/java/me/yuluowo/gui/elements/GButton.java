package me.yuluowo.gui.elements;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;

import java.awt.*;

public class GButton extends GuiButton {

    public GButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        Gui.drawRect(100, 100, 100, 100, new Color(100, 0, 0, 100).getRGB());
        super.drawButton(mc, mouseX, mouseY);
    }
}
