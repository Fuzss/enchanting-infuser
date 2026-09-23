package fuzs.enchantinginfuser.neoforge;

import fuzs.enchantinginfuser.common.EnchantingInfuser;
import fuzs.enchantinginfuser.common.data.loot.ModBlockLootProvider;
import fuzs.enchantinginfuser.common.data.ModRecipeProvider;
import fuzs.enchantinginfuser.common.data.tags.BuiltInEnchantmentTagsProvider;
import fuzs.enchantinginfuser.common.data.tags.ModBlockTagsProvider;
import fuzs.enchantinginfuser.common.data.tags.ModEnchantmentTagsProvider;
import fuzs.enchantinginfuser.common.init.ModRegistry;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import fuzs.puzzleslib.neoforge.api.init.v3.capability.NeoForgeCapabilityHelper;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.fml.common.Mod;

@Mod(EnchantingInfuser.MOD_ID)
public class EnchantingInfuserNeoForge {

    public EnchantingInfuserNeoForge() {
        ModConstructor.construct(EnchantingInfuser.MOD_ID, EnchantingInfuser::new);
        registerModIntegrations();
        NeoForgeCapabilityHelper.registerRestrictedBlockEntityContainer(ModRegistry.INFUSER_BLOCK_ENTITY_TYPE);
        DataProviderBuilder.of(EnchantingInfuser.MOD_ID)
                .addLootProvider(ModBlockLootProvider::new, LootContextParamSets.BLOCK)
                .addProvider(ModBlockTagsProvider::new, ModEnchantmentTagsProvider::new)
                .addRecipeProvider(ModRecipeProvider::new);
        DataProviderBuilder.ofBuiltIn(EnchantingInfuser.TREASURE_ENCHANTMENTS_LOCATION, PackType.SERVER_DATA)
                .addProvider(BuiltInEnchantmentTagsProvider::new);
    }

    private static void registerModIntegrations() {
//        EnchantingInfuser.CONFIG.getHolder(ServerConfig.class).addCallback((ServerConfig config) -> {
//            if (config.apotheosisIntegration && ModLoaderEnvironment.INSTANCE.isModLoaded("apothic_enchanting")) {
//                EnchantingBehavior.set(ApotheosisEnchantingBehavior.INSTANCE);
//            } else {
//                EnchantingBehavior.set(VanillaEnchantingBehavior.INSTANCE);
//            }
//        });
    }
}
