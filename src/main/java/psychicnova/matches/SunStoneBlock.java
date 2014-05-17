package psychicnova.matches;


import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.CreativeTabs;

public class SunStoneBlock extends Block {
    public SunStoneBlock() {
        super(Material.rock);
        setHardness(4F);
        setStepSound(Block.soundTypeStone);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("sunStone");
        setBlockTextureName("matches:sunStone");
        setHarvestLevel("pickaxe", 1);
        setLightLevel(9999999);
    }
}
