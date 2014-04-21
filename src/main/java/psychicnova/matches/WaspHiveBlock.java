package psychicnova.matches;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class WaspHiveBlock extends BlockContainer {
    public WaspHiveBlock() {
        super(Material.dragonEgg);
        setHardness(25F);
        setStepSound(Block.soundTypeSnow);
        setCreativeTab(CreativeTabs.tabMisc);
        setBlockName("waspHive");
        setBlockTextureName("matches:waspHive");
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new WaspHiveTileEntity();
    }
}
