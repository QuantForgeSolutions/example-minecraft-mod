package dev.quantforge.examplemod.item;

import dev.quantforge.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.registerSimpleItem(
            "bismuth",
            new Item.Properties()
    );

    public static final DeferredItem<Item> COBALT = ITEMS.registerSimpleItem(
            "cobalt",
            new Item.Properties()
    );

    public static final DeferredItem<Item> MITHRIL = ITEMS.registerSimpleItem(
            "mithril",
            new Item.Properties()
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}