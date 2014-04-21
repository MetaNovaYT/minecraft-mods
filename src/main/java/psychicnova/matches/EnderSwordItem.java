package psychicnova.matches;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;


public class EnderSwordItem extends ItemSword {
    public EnderSwordItem() {
        super(ToolMaterial.EMERALD);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("enderSword");
        setTextureName("matches:enderSword");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 500009;
    }
}
