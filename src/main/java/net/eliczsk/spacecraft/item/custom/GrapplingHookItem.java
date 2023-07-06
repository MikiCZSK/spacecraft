package net.eliczsk.spacecraft.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class GrapplingHookItem extends Item {
    public GrapplingHookItem(Properties properties) {
        super(properties);
    }

    @Override // DOES NOT WORK
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide()) {
            Vec3 angles = player.getLookAngle();
            Vec3 locationofplayer = player.position();
          //  player.sendSystemMessage(Component.literal("First" + locationofplayer));
            Vec3 offset = new Vec3(10.0,10.0,10.0);

          //  player.sendSystemMessage(Component.literal("Second" + locationofplayer));

            double resX = angles.x * offset.x;
            double resY = angles.y * offset.y;
            double resZ = angles.z * offset.z;
            double test = 2.0f;
            Vec3 tests = new Vec3(test,test,test);

            player.move(MoverType.PLAYER,locationofplayer.add(resX,resY,resZ));
            player.move(MoverType.PISTON,tests);

         //  player.getCooldowns().addCooldown(this,20);


        }


        return super.use(level, player, hand);
    }


}
