package com.fellsakura.moreapple.item;

import com.fellsakura.moreapple.MoreApple;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MoreAppleItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreApple.MOD_ID);


    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.registerSimpleItem("diamond_apple",
            () -> new Item.Properties().food(MoreAppleFoods.DIAMOND_APPLE, MoreAppleConsumables.DIAMOND_APPLE));
    public static final DeferredItem<Item> IRON_APPLE = ITEMS.registerSimpleItem("iron_apple",
            () -> new Item.Properties().food(MoreAppleFoods.IRON_APPLE, MoreAppleConsumables.IRON_APPLE));
    public static final DeferredItem<Item> COPPER_APPLE = ITEMS.registerSimpleItem("copper_apple",
            () -> new Item.Properties().food(MoreAppleFoods.COPPER_APPLE, MoreAppleConsumables.COPPER_APPLE));
    public static final DeferredItem<Item> NETHERITE_APPLE = ITEMS.registerSimpleItem("netherite_apple",
            () -> new Item.Properties().food(MoreAppleFoods.NETHERITE_APPLE, MoreAppleConsumables.NETHERITE_APPLE));

    public static final DeferredItem<Item> EMERALD_APPLE = ITEMS.registerSimpleItem("emerald_apple",
            () -> new Item.Properties().food(MoreAppleFoods.EMERALD_APPLE, MoreAppleConsumables.EMERALD_APPLE));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus); // Register the items
    }
}
