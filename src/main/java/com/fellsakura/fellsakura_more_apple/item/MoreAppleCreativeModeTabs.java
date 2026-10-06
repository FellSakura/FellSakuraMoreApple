package com.fellsakura.fellsakura_more_apple.item;

import com.fellsakura.fellsakura_more_apple.MoreApple;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MoreAppleCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,MoreApple.MOD_ID);

    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> MORE_APPLE_TAB =
            CREATIVE_MODE_TABS.register("more_apple_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.fellsakura_more_apple"))
            .icon(() -> new ItemStack(MoreAppleItems.DIAMOND_APPLE.get()))
                    .displayItems((Parameters, output) -> {
                            output.accept(MoreAppleItems.DIAMOND_APPLE.get());
                            output.accept(MoreAppleItems.IRON_APPLE.get());
                            output.accept(MoreAppleItems.COPPER_APPLE.get());
                            output.accept(MoreAppleItems.NETHERITE_APPLE.get());
                            output.accept(MoreAppleItems.EMERALD_APPLE.get());
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
