package fuzs.enchantinginfuser.neoforge;

import fuzs.enchantinginfuser.common.EnchantingInfuser;
import fuzs.enchantinginfuser.common.data.loot.ModBlockLootProvider;
import fuzs.enchantinginfuser.common.data.ModRecipeProvider;
import fuzs.enchantinginfuser.common.data.tags.BuiltInEnchantmentTagsProvider;
import fuzs.enchantinginfuser.common.data.tags.ModBlockTagsProvider;
import fuzs.enchantinginfuser.common.data.tags.ModEnchantmentTagsProvider;
import fuzs.enchantinginfuser.common.init.ModRegistry;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import fuzs.puzzleslib.neoforge.api.init.v3.capability.NeoForgeCapabilityHelper;
import net.minecraft.server.packs.PackType;
import net.neoforged.fml.common.Mod;

@Mod(EnchantingInfuser.MOD_ID)
public class EnchantingInfuserNeoForge {

    public EnchantingInfuserNeoForge() {
        ModConstructor.construct(EnchantingInfuser.MOD_ID, EnchantingInfuser::new);
        registerModIntegrations();
        NeoForgeCapabilityHelper.registerRestrictedBlockEntityContainer(ModRegistry.INFUSER_BLOCK_ENTITY_TYPE);
        DataProviderHelper.registerDataProviders(EnchantingInfuser.MOD_ID,
                ModBlockLootProvider::new,
                ModBlockTagsProvider::new,
                ModEnchantmentTagsProvider::new,
                ModRecipeProvider::new);
        DataProviderHelper.registerDataProviders(EnchantingInfuser.TREASURE_ENCHANTMENTS_LOCATION,
                PackType.SERVER_DATA,
                BuiltInEnchantmentTagsProvider::new);
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
