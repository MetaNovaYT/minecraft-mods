package psychicnova.matches;


import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.CreativeTabs;

public class SunStoneBlock extends Block {
    public SunStoneBlock() {
        super(Material.rock);
        setHardness(25F);
        setStepSound(Block.soundTypeStone);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("sunStone");
        setBlockTextureName("matches:sunStone");
    }
}
