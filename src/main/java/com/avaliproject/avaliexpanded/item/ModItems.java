package com.avaliproject.avaliexpanded.item;

import com.avaliproject.avaliexpanded.AvaliExpanded;
import com.avaliproject.avaliexpanded.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AvaliExpanded.MOD_ID);

    public static final DeferredItem<Item> LUME = ITEMS.register("lume",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUME_BIT = ITEMS.register("lume_bit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AVALI_ICON = ITEMS.register("avali_icon",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PROTOGEN_ICON = ITEMS.register("protogen_icon",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THERMAL_CRYSTAL = ITEMS.register("thermal_crystal",
            () -> new FuelItem(new Item.Properties(), 2600));
    public static final DeferredItem<Item> KIRIKIRI_PIE = ITEMS.register("kirikiri_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KIRIKIRI_PIE)));
    public static final DeferredItem<Item> AVALI_MUFFIN = ITEMS.register("avali_muffin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AVALI_MUFFIN)));
    public static final DeferredItem<Item> AVALON_TACO = ITEMS.register("avalon_taco",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AVALON_TACO)));
    public static final DeferredItem<Item> GROOU = ITEMS.register("groou",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GROOU)));
    public static final DeferredItem<Item> PIRUZA = ITEMS.register("piruza",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PIRUZA)));
    public static final DeferredItem<Item> GROOU_JUICE = ITEMS.register("groou_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GROOU_JUICE)));
    public static final DeferredItem<Item> KIRI_CURRY = ITEMS.register("kiri_curry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KIRI_CURRY)));
    public static final DeferredItem<Item> KIRI_JAM = ITEMS.register("kiri_jam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KIRI_JAM)));
    public static final DeferredItem<Item> PIRU_FLOUR = ITEMS.register("piru_flour",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PIRU_NOODLE = ITEMS.register("piru_noodle",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PIRU_NOODLE)));
    public static final DeferredItem<Item> AEROGEL = ITEMS.register("aerogel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AERO_CRYSTAL = ITEMS.register("aero_crystal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SYNC_CRYSTAL = ITEMS.register("sync_crystal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_DURASTEEL = ITEMS.register("raw_durasteel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_AEGISALT = ITEMS.register("raw_aegisalt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REFINED_AEGISALT = ITEMS.register("refined_aegisalt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DURASTEEL_INGOT = ITEMS.register("durasteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AEROMER = ITEMS.register("aeromer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AVALI_BOTTLE = ITEMS.register("avali_bottle",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBER = ITEMS.register("fiber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NAKATI_BARK = ITEMS.register("nakati_bark",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NANITE_INJECTOR = ITEMS.register("nanite_injector",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PROTOSTEEL_INGOT = ITEMS.register("protosteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOVEN_FABRIC = ITEMS.register("woven_fabric",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOVEN_GRAPHENE = ITEMS.register("woven_graphene",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUCKER = ITEMS.register("tucker",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TUCKER)));
    public static final DeferredItem<Item> KIRI_CIDER = ITEMS.register("kiri_cider",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KIRI_CIDER)));
    public static final DeferredItem<Item> KIRI_FRUIT = ITEMS.register("kiri_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KIRI_FRUIT)));
    public static final DeferredItem<Item> SPICY_JERKY = ITEMS.register("spicy_jerky",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SPICY_JERKY)));
    public static final DeferredItem<Item> AVALI_BBQ = ITEMS.register("avali_bbq",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AVALI_BBQ)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
