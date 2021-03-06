package alexndr.plugins.Aesthetics;

import alexndr.api.content.blocks.SimpleBars;
import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.blocks.SimpleDoor;
import alexndr.api.content.blocks.SimpleStairs;
import alexndr.api.content.items.SimpleDoorItem;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.registry.ContentCategories;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * @author AleXndrTheGr8st
 */
public class ContentNetherrocks
{
    public static void doItems()
    {
        if (Settings.NRDoors.asBoolean()) 
        {
            dragonstone_door = new SimpleDoorItem(Aesthetics.plugin,
                            (SimpleDoor) dragonstone_door_block)
                                            .setConfigEntry(Settings.dragonstoneDoor.asConfigItem())
                                            .setUnlocalizedName("dragonstone_door")
                                            .setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            argonite_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) argonite_door_block)
                            .setConfigEntry(Settings.argoniteDoor.asConfigItem())
                            .setUnlocalizedName("argonite_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            ashstone_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) ashstone_door_block)
                            .setConfigEntry(Settings.ashstoneDoor.asConfigItem())
                            .setUnlocalizedName("ashstone_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            fyrite_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) fyrite_door_block)
                            .setConfigEntry(Settings.fyriteDoor.asConfigItem())
                            .setUnlocalizedName("fyrite_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            illumenite_door = new SimpleDoorItem(Aesthetics.plugin,
                            (SimpleDoor) illumenite_door_block)
                                            .setConfigEntry(Settings.illumeniteDoor.asConfigItem())
                                            .setUnlocalizedName("illumenite_door")
                                            .setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            // malachite_door = new SimpleDoorItem(Aesthetics.plugin,
            // (SimpleDoor) malachite_door_block)
            // .setConfigEntry(Settings.malachiteDoor.asConfigItem())
            // .setUnlocalizedName("malachite_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        }
    } // end doItems()


    public static void doBlocks()
    {
        if (Settings.NRBricks.asBoolean()) 
        {
            fyrite_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.fyriteBricks)
                            .setStepSound(SoundType.METAL)
                            .setUnlocalizedName("fyrite_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            malachite_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.malachiteBricks)
                            .setStepSound(SoundType.METAL)
                            .setUnlocalizedName("malachite_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            ashstone_bricks = new SimpleBlock(Aesthetics.plugin, Material.ROCK,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.ashstoneBricks)
                            .setStepSound(SoundType.STONE)
                            .setUnlocalizedName("ashstone_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            illumenite_bricks = new SimpleBlock(Aesthetics.plugin, Material.GLASS,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.illumeniteBricks)
                            .setStepSound(SoundType.GLASS)
                            .setUnlocalizedName("illumenite_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            dragonstone_bricks = new SimpleBlock(Aesthetics.plugin, Material.ROCK,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.dragonstoneBricks)
                            .setStepSound(SoundType.STONE)
                            .setUnlocalizedName("dragonstone_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            argonite_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.argoniteBricks)
                            .setStepSound(SoundType.METAL)
                            .setUnlocalizedName("argonite_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

            if (Settings.NRBrickStairs.asBoolean()) 
            {
                fyrite_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                fyrite_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.fyriteBricks).setUnlocalizedName("fyrite_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                malachite_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                malachite_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.malachiteBricks).setUnlocalizedName("malachite_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                ashstone_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                ashstone_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.ashstoneBricks)
                		.setUnlocalizedName("ashstone_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                illumenite_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                illumenite_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.illumeniteBricks).setUnlocalizedName("illumenite_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                dragonstone_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                dragonstone_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.dragonstoneBricks).setUnlocalizedName("dragonstone_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                argonite_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                argonite_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.argoniteBricks).setUnlocalizedName("argonite_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            }  // end-if 
        } // end-if NRBrickStairs

        if (Settings.NRDoors.asBoolean()) 
        {
            dragonstone_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, 
                                                   "dragonstone_door",ContentCategories.Block.OTHER)
                            .setConfigEntry(Settings.dragonstoneDoor)
                            .setUnlocalizedName("dragonstone_door");
            argonite_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON,
                            "argonite_door", ContentCategories.Block.OTHER)
                                            .setConfigEntry(Settings.argoniteDoor)
                                            .setUnlocalizedName("argonite_door");
            ashstone_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON,
                            "ashstone_door", ContentCategories.Block.OTHER)
                                            .setConfigEntry(Settings.ashstoneDoor)
                                            .setUnlocalizedName("ashstone_door");
            fyrite_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON,
                            "fyrite_door", ContentCategories.Block.OTHER)
                                            .setConfigEntry(Settings.fyriteDoor)
                                            .setUnlocalizedName("fyrite_door");
            illumenite_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON,
                            "illumenite_door", ContentCategories.Block.OTHER)
                                            .setConfigEntry(Settings.illumeniteDoor)
                                            .setUnlocalizedName("illumenite_door");
//            malachite_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON,
//                            "malachite_door", ContentCategories.Block.OTHER)
//                                            .setConfigEntry(Settings.malachiteDoor)
//                                            .setUnlocalizedName("malachite_door");
       } // end-if NRDoors

        if (Settings.NRBars.asBoolean()) 
        {
            fyrite_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.fyriteBars).setUnlocalizedName("fyrite_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            malachite_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.malachiteBars).setUnlocalizedName("malachite_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            ashstone_bars = new SimpleBars(Aesthetics.plugin, Material.ROCK, true,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.ashstoneBars).setUnlocalizedName("ashstone_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            illumenite_bars = new SimpleBars(Aesthetics.plugin, Material.GLASS, true,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.illumeniteBars)
                            .setUnlocalizedName("illumenite_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            dragonstone_bars = new SimpleBars(Aesthetics.plugin, Material.ROCK, true,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.dragonstoneBars)
                            .setUnlocalizedName("dragonstone_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            argonite_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.argoniteBars).setUnlocalizedName("argonite_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        } // end-if NRBars
    } // end doBlocks()


    public static void doAchievements()
    {

    }

    // Blocks
    public static Block fyrite_bricks, malachite_bricks, ashstone_bricks, illumenite_bricks,
                    dragonstone_bricks, argonite_bricks;
    public static Block fyrite_brick_stairs, malachite_brick_stairs, ashstone_brick_stairs,
                    illumenite_brick_stairs, dragonstone_brick_stairs, argonite_brick_stairs;
    public static Block dragonstone_door_block, argonite_door_block, ashstone_door_block,
                    fyrite_door_block, illumenite_door_block, malachite_door_block;
    public static Block fyrite_bars, malachite_bars, ashstone_bars, illumenite_bars,
                    dragonstone_bars, argonite_bars;

    // Items
    public static Item dragonstone_door, argonite_door, ashstone_door, fyrite_door,
                    illumenite_door, malachite_door;
} // end class
