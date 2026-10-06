package com.fellsakura.fellsakura_more_apple.datagen;

import com.fellsakura.fellsakura_more_apple.MoreApple;
import com.fellsakura.fellsakura_more_apple.item.MoreAppleItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider {

    protected ModRecipesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.FOOD, MoreAppleItems.DIAMOND_APPLE.get(), 1)
                .define('D', Items.DIAMOND)
                .define('A', Items.APPLE)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);

        shaped(RecipeCategory.FOOD, MoreAppleItems.IRON_APPLE.get(), 1)
                .define('I', Items.IRON_INGOT)
                .define('A', Items.APPLE)
                .pattern("III")
                .pattern("IAI")
                .pattern("III")
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);

        shaped(RecipeCategory.FOOD, MoreAppleItems.COPPER_APPLE.get(), 1)
                .define('C', Items.COPPER_INGOT)
                .define('A', Items.APPLE)
                .pattern("CCC")
                .pattern("CAC")
                .pattern("CCC")
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);

        shaped(RecipeCategory.FOOD, MoreAppleItems.NETHERITE_APPLE.get(), 1)
                .define('N', Items.NETHERITE_INGOT)
                .define('A', Items.APPLE)
                .pattern("NNN")
                .pattern("NAN")
                .pattern("NNN")
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);

        shaped(RecipeCategory.FOOD, MoreAppleItems.EMERALD_APPLE.get(), 1)
                .define('E', Items.EMERALD)
                .define('A', Items.APPLE)
                .pattern("EEE")
                .pattern("EAE")
                .pattern("EEE")
                .unlockedBy("has_emerald", has(Items.EMERALD))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);

        shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE,1)
                .define('A', Items.APPLE)
                .define('G',Items.GOLD_BLOCK)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);

        shaped(RecipeCategory.FOOD, MoreAppleItems.GLASS_APPLE.get(),1)
                .define('G', Items.GLASS)
                .define('A', Items.APPLE)
                .pattern("GGG")
                .pattern("GAG")
                .pattern("GGG")
                .unlockedBy("has_glass", has(Items.GLASS))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);

        shaped(RecipeCategory.FOOD, MoreAppleItems.SLIME_APPLE.get(),1)
                .define('S', Items.SLIME_BALL)
                .define('A', Items.APPLE)
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .unlockedBy("has_slime_ball", has(Items.SLIME_BALL))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(output);
    }

    protected void nineBlockStorageRecipes(
            RecipeCategory unpackedFormCategory,
            ItemLike unpackedForm,
            RecipeCategory packedFormCategory,
            ItemLike packedForm, String packingRecipeId,
            @Nullable String packingRecipeGroup,
            String unpackingRecipeId, @Nullable
            String unpackingRecipeGroup) {
        this.shapeless(unpackedFormCategory, unpackedForm, 9)
                .requires(packedForm)
                .group(unpackingRecipeGroup)
                .unlockedBy(getHasName(packedForm), this.has(packedForm))
                .save(this.output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreApple.MOD_ID, unpackingRecipeId)));
        this.shaped(packedFormCategory, packedForm)
                .define('#', unpackedForm)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(packingRecipeGroup)
                .unlockedBy(getHasName(unpackedForm), this.has(unpackedForm))
                .save(this.output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreApple.MOD_ID, packingRecipeId)));
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput Output) {
            return new ModRecipesProvider(registries, Output);
        }

        @Override
        public String getName() {
            return "recipes generator";
        }
    }
}