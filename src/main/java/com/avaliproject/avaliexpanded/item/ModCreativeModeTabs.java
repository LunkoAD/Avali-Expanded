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
                        output.accept(ModBlocks.THERMAL_CRYSTAL_DEEPSLATE_ORE);
                        output.accept(ModBlocks.THERMAL_CRYSTAL_ORE);
                        output.accept(ModBlocks.AERO_CRYSTAL_DEEPSLATE_ORE);
                        output.accept(ModBlocks.SYNC_CRYSTAL_DEEPSLATE_ORE);
                        output.accept(ModBlocks.SYNC_CRYSTAL_ORE);
                        output.accept(ModBlocks.AERO_CRYSTAL_ORE);
                        output.accept(ModItems.KIRIKIRI_PIE);
                        output.accept(ModItems.AVALI_MUFFIN);
                        output.accept(ModItems.AVALON_TACO);
                        output.accept(ModItems.GROOU);
                        output.accept(ModItems.GROOU_JUICE);
                        output.accept(ModItems.KIRI_JAM);
                        output.accept(ModItems.KIRI_CURRY);
                        output.accept(ModItems.PIRU_NOODLE);
                        output.accept(ModItems.PIRUZA);
                        output.accept(ModItems.AEROGEL);
                        output.accept(ModItems.PIRU_FLOUR);
                        output.accept(ModItems.SYNC_CRYSTAL);
                        output.accept(ModItems.AERO_CRYSTAL);
                        output.accept(ModItems.THERMAL_CRYSTAL);
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
