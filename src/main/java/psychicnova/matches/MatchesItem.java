package psychicnova.matches;

import net.minecraft.item.Item;

public class MatchesItem extends Item {
    public MatchesItem() {
        setMaxStackSize(64);
        setCreativeTab(MatchesMod.tabMatchesMisc);
        setTextureName("matches:Matches");
        setUnlocalizedName("matches");
    }
}
