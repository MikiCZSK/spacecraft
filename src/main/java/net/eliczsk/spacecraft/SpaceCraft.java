package net.eliczsk.spacecraft;

import com.mojang.logging.LogUtils;
import net.eliczsk.spacecraft.block.ModBlocks;
import net.eliczsk.spacecraft.item.ModItems;
import net.eliczsk.spacecraft.world.dimention.ModDimentions;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SpaceCraft.MOD_ID)
public class SpaceCraft
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "spacecraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpaceCraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
       //bus for items
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModDimentions.register();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
