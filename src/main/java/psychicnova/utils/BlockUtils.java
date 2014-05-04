package psychicnova.utils;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Useful utilities for handling blocks
 */
public class BlockUtils {
    /** Returns true if the block is an item. */
    public static final boolean isBlockItem(Item expected, Block actual) {
        return expected.getUnlocalizedName().equals(actual.getUnlocalizedName());
    }
}
