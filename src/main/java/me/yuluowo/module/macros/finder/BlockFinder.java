package me.yuluowo.module.macros.finder;

import me.yuluowo.utils.ChatUtils;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockPos;

public class BlockFinder {
    public static String blockPosition(int x, int y, int z){
        Block block = Minecraft.getMinecraft().theWorld.getBlockState(new BlockPos(x, y, z)).getBlock();
        return block.toString();
    }
}
