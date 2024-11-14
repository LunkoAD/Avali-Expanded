package com.avaliproject.avaliexpanded.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class Aerogel extends Item {

    public Aerogel(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip.avaliextended.aerogel.shift_down"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip.avaliextended.aerogel"));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}