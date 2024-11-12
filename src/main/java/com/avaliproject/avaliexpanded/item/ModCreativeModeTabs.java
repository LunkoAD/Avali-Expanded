package com.avaliproject.avaliexpanded.item;

import com.avaliproject.avaliexpanded.AvaliExpanded;
import com.avaliproject.avaliexpanded.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AvaliExpanded.MOD_ID);

    public static final Supplier<CreativeModeTab> AVALI_ITEMS_TAB = CREATIVE_MODE_TAB.register("avali_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AVALI_ICON.get()))
                    .title(Component.translatable("creativetab.avaliexpanded.avali_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LUME);
                        output.accept(ModItems.LUME_BIT);
                        output.accept(ModBlocks.LUME_BLOCK);
                        output.accept(ModBlocks.LUME_ORE);
                        output.accept(ModBlocks.LUME_DEEPSLATE_ORE);
                    }).build());

    public static final Supplier<CreativeModeTab> PROTOGEN_ITEM_TAB = CREATIVE_MODE_TAB.register("protogen_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PROTOGEN_ICON.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AvaliExpanded.MOD_ID, "avali_items_tab"))
                    .title(Component.translatable("creativetab.avaliexpanded.protogen_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PROTOGEN_ICON);
                    }).build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
