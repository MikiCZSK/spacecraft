package net.eliczsk.spacecraft.item.custom;

import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class GrapplingHookItem extends Item {
    public GrapplingHookItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide()) {
            Vec3 a = player.getLookAngle();
            Vec3 locationofplayer = player.position();
            Vec3 offset;
            offset.add(1,2,6);

           // a *= offset;
          //  player.move();
            player.sendSystemMessage(Component.literal("Hello" + a));
            player.getCooldowns().addCooldown(this,20);
            if(player.isNoGravity())
                player.setNoGravity(false);

        }


        return super.use(level, player, hand);
    }


}
