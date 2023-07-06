package net.eliczsk.spacecraft.block;

import net.eliczsk.spacecraft.SpaceCraft;
import net.eliczsk.spacecraft.item.ModCreativeModeTab;
import net.eliczsk.spacecraft.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SpaceCraft.MOD_ID);
    // Deferred register idk...

    //Blocks, also needed to make json files in blockstates, models (block and item) and textures
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f)), ModCreativeModeTab.TAB_SPACECRAFT);
    public static final RegistryObject<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.TAB_SPACECRAFT);
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.TAB_SPACECRAFT);

    public static final RegistryObject<Block> MOON_TURF = registerBlock("moon_turf",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.TAB_SPACECRAFT);





    //Register it as a item and something
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }





    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

