package psychicnova.matches;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NeedleItem extends Item {
    public NeedleItem() {
        setMaxStackSize(64);
        setCreativeTab(MatchesMod.tabMatchesSurgical);
        setTextureName("matches:Needle");
        setUnlocalizedName("needle");
    }
}