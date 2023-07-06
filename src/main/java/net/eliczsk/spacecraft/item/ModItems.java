package net.eliczsk.spacecraft.item;

import net.eliczsk.spacecraft.item.ModCreativeModeTab;
import net.eliczsk.spacecraft.SpaceCraft;
import net.eliczsk.spacecraft.item.custom.GrapplingHookItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Adding of Deferred register
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpaceCraft.MOD_ID);

    //Adding of Item itself

    public static final RegistryObject<Item> ALUMINIUMINGOT = ITEMS.register( "aluminium_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPACECRAFT)));
    public static final RegistryObject<Item> RAWALUMINIUM = ITEMS.register( "raw_aluminium_ore",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPACECRAFT)));
   /* public static final RegistryObject<Item> TININGOT = ITEMS.register( "tiningot",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> TININGOT = ITEMS.register( "tiningot",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
*/
   public static final RegistryObject<Item> GRAPPLING_HOOK = ITEMS.register( "grappling_hook",
           ()-> new GrapplingHookItem(new Item.Properties().tab(ModCreativeModeTab.TAB_SPACECRAFT).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
