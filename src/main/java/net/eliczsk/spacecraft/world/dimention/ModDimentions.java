package net.eliczsk.spacecraft.world.dimention;

import net.eliczsk.spacecraft.SpaceCraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimentions {
    public static final ResourceKey<Level> MOON_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,new ResourceLocation(SpaceCraft.MOD_ID,"moon"));
    public static final ResourceKey<DimensionType> MOON_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, MOON_KEY.registry()); // should be .getRegistryName()
    public static void register(){
        System.out.println("Registering mod dimensions for Spacecraft!");
    }


}
