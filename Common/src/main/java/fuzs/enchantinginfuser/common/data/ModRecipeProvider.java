package fuzs.enchantinginfuser.common.data;

import fuzs.enchantinginfuser.common.init.ModRegistry;
import fuzs.puzzleslib.common.api.data.v3.recipes.AbstractRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;

public class ModRecipeProvider extends AbstractRecipeProvider {

    public ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
    }

    @Override
    public void buildRecipes() {
        this.shaped(RecipeCategory.DECORATIONS, ModRegistry.INFUSER_ITEM.value())
                .define('B', Items.BOOK)
                .define('#', Items.CRYING_OBSIDIAN)
                .define('A', Items.AMETHYST_SHARD)
                .define('T', Items.ENCHANTING_TABLE)
                .pattern(" B ")
                .pattern("A#A")
                .pattern("#T#")
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), this.has(Items.AMETHYST_SHARD))
                .save(this.output);
        this.shaped(RecipeCategory.DECORATIONS, ModRegistry.ADVANCED_INFUSER_ITEM.value())
                .define('B', Items.BOOK)
                .define('#', Items.CRYING_OBSIDIAN)
                .define('A', Items.NETHERITE_INGOT)
                .define('T', ModRegistry.INFUSER_ITEM.value())
                .pattern(" B ")
                .pattern("A#A")
                .pattern("#T#")
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), this.has(Items.NETHERITE_INGOT))
                .save(this.output);
    }
}
