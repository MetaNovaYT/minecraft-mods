package psychicnova.matches;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import psychicnova.utils.BlockUtils;

public class MatchesFuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        Item item = fuel.getItem();
        if (BlockUtils.isBlockItem(item, MatchesMod.sunStone)) {
            return 8000;
        }
        return 0;
    }
}
