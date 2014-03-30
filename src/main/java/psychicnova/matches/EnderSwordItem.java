package psychicnova.matches;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class EnderSwordItem extends Item {
    public EnderSwordItem() {
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("enderSword");
        setTextureName("matches:enderSword");
    }
}
