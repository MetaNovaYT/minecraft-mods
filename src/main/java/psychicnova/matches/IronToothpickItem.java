package psychicnova.matches;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronToothpickItem extends Item {
    public IronToothpickItem() {
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setTextureName("matches:IronToothpick");
        setUnlocalizedName("ironToothpick");
    }
}