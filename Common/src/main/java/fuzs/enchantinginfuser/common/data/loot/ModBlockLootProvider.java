package fuzs.enchantinginfuser.common.data.loot;

import fuzs.enchantinginfuser.common.init.ModRegistry;
import fuzs.puzzleslib.common.api.data.v3.loot.AbstractBlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;

public class ModBlockLootProvider extends AbstractBlockLootSubProvider {

    public ModBlockLootProvider(LootTableSubProvider.Context context) {
        super(context);
    }

    @Override
    public void generate() {
        this.add(ModRegistry.INFUSER_BLOCK.value(), this::createNameableBlockEntityTable);
        this.add(ModRegistry.ADVANCED_INFUSER_BLOCK.value(), this::createNameableBlockEntityTable);
    }
}
