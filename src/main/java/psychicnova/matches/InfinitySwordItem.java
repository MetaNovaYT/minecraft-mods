package psychicnova.matches;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class InfinitySwordItem extends ItemSword {
    public InfinitySwordItem() {
        super(ToolMaterial.EMERALD);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("infinitySword");
        setTextureName("matches:infinitySword");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
}
