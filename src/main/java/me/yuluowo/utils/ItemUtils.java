package me.yuluowo.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

public class ItemUtils {

    private static final Minecraft mc = Minecraft.getMinecraft();

    public static String heldItem(){
        return mc.thePlayer.getHeldItem().getDisplayName();
    }

    public static int findItemInHotbar(String Name){
        InventoryPlayer inventoryPlayer = mc.thePlayer.inventory;
        for(int i = 0; i < 9; i++){
            ItemStack currentStack = inventoryPlayer.getStackInSlot(i);
            if(currentStack != null){
                if(currentStack.getDisplayName().contains(Name)){
                    return i;
                }
            }
        }
        return -1;
    }
}
