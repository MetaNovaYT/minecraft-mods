package psychicnova.matches;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.util.Random;

@Mod(modid = MatchesMod.MODID, version = MatchesMod.VERSION)
public class MatchesMod {
    public static final String MODID = "matches";
    public static final String VERSION = "0.0.1";

    // The instance of your mod that Forge uses.
    @Mod.Instance(value = MatchesMod.MODID)
    public static MatchesMod instance;

    public static Item matches;

    public static Item enderSword;

    public static Item infinitySword;

    public static Item sunSword;

    public static Block sunStone;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="psychicnova.matches.client.ClientProxy", serverSide="psychicnova.matches.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event) {
        enderSword = new EnderSwordItem();
        infinitySword = new InfinitySwordItem();
        sunSword = new SunSwordItem();
        sunStone = new SunStoneBlock();
        GameRegistry.registerItem(enderSword, enderSword.getUnlocalizedName());
        GameRegistry.registerItem(infinitySword, infinitySword.getUnlocalizedName());
        GameRegistry.registerItem(sunSword, sunSword.getUnlocalizedName());
        GameRegistry.registerBlock(sunStone, sunStone.getUnlocalizedName());
        registerEntity(WaspEntity.class, "wasp");
        proxy.registerRenderers();
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
        ItemStack enderPearlStack = new ItemStack(Items.ender_pearl, 1);
        ItemStack eyeOfEnderStack = new ItemStack(Items.ender_eye, 1);
        ItemStack diamondBlockStack = new ItemStack(Blocks.diamond_block);
        ItemStack glowStoneStack = new ItemStack(Blocks.glowstone);
        ItemStack sunStoneStack = new ItemStack(MatchesMod.sunStone);

        GameRegistry.addShapelessRecipe(diamondsStack, dirtStack);

        GameRegistry.addShapelessRecipe(diamondsStack, dirtStack, dirtStack,
                dirtStack, dirtStack, dirtStack, dirtStack, new ItemStack(
                Blocks.sand), gravelStack, cobbleStack);

        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone), "xy", "yx",
                'x', dirtStack, 'y', gravelStack);

        GameRegistry.addRecipe(new ItemStack(Blocks.end_stone), "xyx", "ydy", "xyx",
                'x', eyeOfEnderStack, 'y', enderPearlStack, 'd', diamondsStack);

        GameRegistry.addRecipe(new ItemStack(enderSword), " e ", "beb", " r ",
                'e', endStoneStack, 'b', boneStack, 'r', blazeRodStack);

        GameRegistry.addRecipe(new ItemStack(infinitySword), " d ", "bdb", " g ",
                'd', diamondBlockStack, 'b', blazeRodStack, 'g', glowStoneStack);

        GameRegistry.addRecipe(new ItemStack(sunSword), " s ", "bsb", " g ",
                's', sunStoneStack, 'b', diamondsStack, 'g', blazeRodStack);

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

    public static void registerEntity(Class entityClass, String name) {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();
        Random rand = new Random(seed);
        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }
}
