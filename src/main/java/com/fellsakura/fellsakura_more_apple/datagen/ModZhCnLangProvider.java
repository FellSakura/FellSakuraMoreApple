package com.fellsakura.fellsakura_more_apple.datagen;

import com.fellsakura.fellsakura_more_apple.MoreApple;
import com.fellsakura.fellsakura_more_apple.item.MoreAppleItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, MoreApple.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
       add(MoreAppleItems.DIAMOND_APPLE.get(), "钻石苹果");
       add(MoreAppleItems.IRON_APPLE.get(), "铁苹果");
        add(MoreAppleItems.COPPER_APPLE.get(), "铜苹果");
        add(MoreAppleItems.NETHERITE_APPLE.get(), "下界合金苹果");
        add(MoreAppleItems.EMERALD_APPLE.get(), "绿宝石苹果");
        add(MoreAppleItems.GLASS_APPLE.get(), "玻璃苹果");
        add(MoreAppleItems.SLIME_APPLE.get(), "黏液苹果");

        add("itemGroup.fellsakura_more_apple", "更多苹果");
    }
}
