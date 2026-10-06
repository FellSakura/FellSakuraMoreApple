package com.fellsakura.fellsakura_more_apple.item;

import net.minecraft.world.food.FoodProperties;

public class MoreAppleFoods {

    public static final FoodProperties DIAMOND_APPLE = (new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.4f)
            .alwaysEdible()
            .build());
    public static final FoodProperties IRON_APPLE = (new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.8f)
            .alwaysEdible()
            .build());
    public static final FoodProperties COPPER_APPLE = (new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.8f)
            .alwaysEdible()
            .build());

    public static final FoodProperties NETHERITE_APPLE = (new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.4f)
            .alwaysEdible()
            .build());
    public static final FoodProperties EMERALD_APPLE = (new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.4f)
            .alwaysEdible()
            .build());

}
