package psychicnova.matches;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class InfinitySwordItem extends ItemSword {
    public InfinitySwordItem() {
        super(ToolMaterial.EMERALD);
        setMaxStackSize(1);
        setCreativeTab(MatchesMod.tabLegendaryWeapons);
        setUnlocalizedName("infinitySword");
        setTextureName("matches:infinitySword");
        setMaxDamage(1098);
    }
    /*
    Makes it fully 3D
     */
    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
}
