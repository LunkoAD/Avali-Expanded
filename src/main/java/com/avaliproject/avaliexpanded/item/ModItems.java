package com.avaliproject.avaliexpanded.item;

import com.avaliproject.avaliexpanded.AvaliExpanded;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
