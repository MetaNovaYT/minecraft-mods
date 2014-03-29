package psychicnova.matches;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MatchesMod.MODID, version = MatchesMod.VERSION)
public class MatchesMod
{
    public static final String MODID = "matches";
    public static final String VERSION = "0.0.1";

    // The instance of your mod that Forge uses.
    @Mod.Instance(value = MatchesMod.MODID)
    public static MatchesMod instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="psychicnova.matches.client.ClientProxy", serverSide="psychicnova.matches.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("preInit on the Matches mod!");
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event) {
        System.out.println("load on the Matches mod!");
        proxy.registerRenderers();
        proxy.registerRenderers();

        ItemStack dirtStack = new ItemStack(Blocks.dirt);
        ItemStack diamondsStack = new ItemStack(Items.diamond, 64);
        ItemStack blackWoolStack = new ItemStack(Blocks.wool, 42, 15);
        ItemStack gravelStack = new ItemStack(Blocks.gravel);
        ItemStack cobbleStack = new ItemStack(Blocks.cobblestone);
        ItemStack endStoneStack = new ItemStack(Blocks.end_stone);
        ItemStack blazeRodStack = new ItemStack(Items.blaze_rod, 2);
        ItemStack boneStack = new ItemStack(Items.bone, 4);

        GameRegistry.addShapelessRecipe(diamondsStack, dirtStack);

        GameRegistry.addShapelessRecipe(diamondsStack, dirtStack, dirtStack,
                dirtStack, dirtStack, dirtStack, dirtStack, new ItemStack(
                Blocks.sand), gravelStack, cobbleStack);

        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone), "xy", "yx",
                'x', dirtStack, 'y', gravelStack);

        GameRegistry.addRecipe(new ItemStack(Blocks.end_stone), "xyx", "ydy", "xyx",
                'x', dirtStack, 'y', gravelStack, 'd', diamondsStack);

        GameRegistry.addRecipe(new ItemStack(Items.diamond_sword), " e ", "beb", " r ",
                'e', endStoneStack, 'b', boneStack, 'r', blazeRodStack);

        /*
        GameRegistry.addSmelting(Blocks.stone.blockID, new ItemStack(
                Blocks.stoneBrick), 0.1f);

        FurnaceRecipes.smelting().addSmelting(Blocks.wool.blockID, 15,
                new ItemStack(Blocks.cloth, 1, 0), 0.1f);
        */
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("postInit on the Matches mod!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Welcome to the Matches mod!");
    }
}
