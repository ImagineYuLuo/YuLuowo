package me.yuluowo.module.macros;

import me.yuluowo.module.macros.finder.BlockFinder;
import me.yuluowo.utils.ChatUtils;
import me.yuluowo.utils.ItemUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class MiningMacro {
    private static final Minecraft mc = Minecraft.getMinecraft();

    private static int playerX;
    private static int playerY;
    private static int playerZ;

    public static boolean checkPickaxeInHotbar = false;

    @SubscribeEvent
    public void onTick(TickEvent event){
        if(mc != null && mc.theWorld != null && mc.thePlayer != null){
            playerX = mc.thePlayer.getPosition().getX();
            playerY = mc.thePlayer.getPosition().getY();
            playerZ = mc.thePlayer.getPosition().getZ();
        }

        if(checkPickaxeInHotbar){
            int pickaxeInHotbar = ItemUtils.findItemInHotbar("Pickaxe");
            if(pickaxeInHotbar != -1){

            }else{
                ChatUtils.send("You don't have any pickaxe in your hotbar");
            }
        }
    }
}
