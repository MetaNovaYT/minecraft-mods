package psychicnova.matches;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;


public class SunSwordItem extends ItemSword {
    public SunSwordItem() {
        super(ToolMaterial.EMERALD);
        setMaxStackSize(1);
        setCreativeTab(MatchesMod.tabLegendaryWeapons);
        setUnlocalizedName("sunSword");
        setTextureName("matches:sunSword");
        setMaxDamage(687);
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
