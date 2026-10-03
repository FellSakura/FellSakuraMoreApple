package com.fellsakura.moreapple.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class MoreAppleConsumables {
    public static final Consumable DIAMOND_APPLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200),
                            new MobEffectInstance(MobEffects.REGENERATION, 1200, 2),
                            new MobEffectInstance(MobEffects.ABSORPTION, 4800, 3),
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 7200),
                            new MobEffectInstance(MobEffects.RESISTANCE, 7200, 1)
                    )
            )).build();
    public static final Consumable EMERALD_APPLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, 1200, 2),
                            new MobEffectInstance(MobEffects.ABSORPTION, 4800, 3),
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 7200),
                            new MobEffectInstance(MobEffects.HASTE, 2400, 3),
                            new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 2400, 1)
                    )
            )).build();
    public static final Consumable NETHERITE_APPLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 8400),
                            new MobEffectInstance(MobEffects.REGENERATION, 2400, 2),
                            new MobEffectInstance(MobEffects.ABSORPTION, 6000, 4),
                            new MobEffectInstance(MobEffects.RESISTANCE, 8400, 4),
                            new MobEffectInstance(MobEffects.STRENGTH, 6000, 4)
                    )
            )).build();
    public static final Consumable IRON_APPLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, 200, 0),
                            new MobEffectInstance(MobEffects.ABSORPTION, 600, 1)
                    )
            )).build();

    public static final Consumable COPPER_APPLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, 300, 1),
                            new MobEffectInstance(MobEffects.RESISTANCE, 4800, 2)
                            )
            )).build();
}
