package com.fellsakura.fellsakura_more_apple;

import com.fellsakura.fellsakura_more_apple.datagen.*;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MoreApple.MOD_ID)
public class MoreAppleGenerator {
    @SubscribeEvent
    static void gatherData(GatherDataEvent.Client event) {
      event.createProvider(ModRecipesProvider.Runner::new);
      event.createProvider(ModEnUsLangProvider::new);
      event.createProvider(ModZhCnLangProvider::new);
      event.createProvider(ModItemTagsProvider::new);
      event.createProvider(ModModelsProvider::new);

    }
}
