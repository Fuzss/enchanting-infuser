package fuzs.enchantinginfuser.common.data.client;

import fuzs.enchantinginfuser.common.client.gui.components.InfuserMenuButton;
import fuzs.enchantinginfuser.common.client.gui.components.LevelBasedOperationButton;
import fuzs.enchantinginfuser.common.client.gui.screens.inventory.EnchantmentLevelEntry;
import fuzs.enchantinginfuser.common.client.gui.screens.inventory.InfuserScreen;
import fuzs.enchantinginfuser.common.client.util.EnchantmentTooltipHelper;
import fuzs.enchantinginfuser.common.init.ModRegistry;
import fuzs.enchantinginfuser.common.world.level.block.InfuserBlock;
import fuzs.puzzleslib.common.api.client.data.v3.language.AbstractLanguageProvider;
import fuzs.puzzleslib.common.api.data.v3.core.DataProviderContext;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations() {
        this.add(ModRegistry.INFUSER_BLOCK.value(), "Enchanting Infuser");
        this.add(ModRegistry.ADVANCED_INFUSER_BLOCK.value(), "Advanced Enchanting Infuser");
        this.add(InfuserBlock.COMPONENT_CHOOSE, "Choose enchantments for your gear.");
        this.add(InfuserBlock.COMPONENT_CHOOSE_AND_MODIFY, "Choose, modify and remove enchantments for your gear.");
        this.add(InfuserBlock.COMPONENT_REPAIR, "Repair your gear with levels.");
        this.add(EnchantmentTooltipHelper.KEY_CURRENT_ENCHANTING_POWER, "Enchanting Power: %s / %s");
        this.add(InfuserScreen.KEY_TOOLTIP_HINT,
                "Place more bookshelves in a square around the infuser on up to two layers.");
        this.add(InfuserMenuButton.KEY_TOOLTIP_DURABILITY, "Durability: %s");
        this.add(InfuserMenuButton.KEY_TOOLTIP_CHANGE, "%s -> %s");
        this.add(InfuserMenuButton.KEY_TOOLTIP_EXPERIENCE, "Gain Experience Points");
        this.add(EnchantmentLevelEntry.UNKNOWN_ENCHANT_COMPONENT,
                "This enchantment is too powerful for an infuser with such little enchanting power.");
        this.add(LevelBasedOperationButton.INCREASE_LEVEL_COMPONENT,
                "Further increasing the level for this enchantment requires an infuser with more enchanting power.");
        this.add(LevelBasedOperationButton.MODIFY_LEVEL_COMPONENT,
                "Modifying the level for this enchantment requires an infuser with more enchanting power.");
        this.add(EnchantmentTooltipHelper.KEY_INCOMPATIBLE_ENCHANTMENTS,
                "This enchantment is incompatible with: %s");
    }
}
