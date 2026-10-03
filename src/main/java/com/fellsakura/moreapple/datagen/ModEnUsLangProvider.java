package com.fellsakura.moreapple.datagen;

import com.fellsakura.moreapple.MoreApple;
import com.fellsakura.moreapple.item.MoreAppleItems;
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

        add("itemGroup.moreapple", "More Apple");
    }
}
