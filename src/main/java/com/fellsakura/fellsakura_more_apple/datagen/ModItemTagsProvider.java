package com.fellsakura.fellsakura_more_apple.datagen;

import com.fellsakura.fellsakura_more_apple.MoreApple;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, MoreApple.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}
