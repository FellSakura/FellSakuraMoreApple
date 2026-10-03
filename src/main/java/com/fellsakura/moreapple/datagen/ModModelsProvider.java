package com.fellsakura.moreapple.datagen;

import com.fellsakura.moreapple.MoreApple;
import com.fellsakura.moreapple.item.MoreAppleItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;

import java.util.stream.Stream;

public class ModModelsProvider extends ModelProvider {
    public ModModelsProvider(PackOutput output) {
        super(output, MoreApple.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(MoreAppleItems.DIAMOND_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MoreAppleItems.IRON_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MoreAppleItems.COPPER_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MoreAppleItems.NETHERITE_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(MoreAppleItems.EMERALD_APPLE.get(), ModelTemplates.FLAT_ITEM);
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return MoreAppleItems.ITEMS.getEntries().stream();
    }
}
