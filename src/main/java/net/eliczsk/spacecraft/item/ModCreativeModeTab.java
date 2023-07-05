package net.eliczsk.spacecraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_SPACECRAFT = new CreativeModeTab("spacecrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAWALUMINIUM.get());
        }
    };
}
