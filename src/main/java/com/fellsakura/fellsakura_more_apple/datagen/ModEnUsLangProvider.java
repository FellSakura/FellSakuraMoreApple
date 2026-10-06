package com.fellsakura.fellsakura_more_apple.datagen;

import com.fellsakura.fellsakura_more_apple.MoreApple;
import com.fellsakura.fellsakura_more_apple.item.MoreAppleItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(PackOutput output) {
        super(output, MoreApple.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(MoreAppleItems.DIAMOND_APPLE.get(), "Diamond Apple");
        add(MoreAppleItems.IRON_APPLE.get(), "Iron Apple");
        add(MoreAppleItems.COPPER_APPLE.get(), "Copper Apple");
        add(MoreAppleItems.EMERALD_APPLE.get(), "Emerald Apple");
        add(MoreAppleItems.NETHERITE_APPLE.get(), "Netherite Apple");
        add(MoreAppleItems.GLASS_APPLE.get(), "Glass Apple");
        add(MoreAppleItems.SLIME_APPLE.get(), "Slime Apple");

        add("itemGroup.fellsakura_more_apple", "More Apple");
    }
}
