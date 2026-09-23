package fuzs.enchantinginfuser.neoforge.client;

import fuzs.enchantinginfuser.common.EnchantingInfuser;
import fuzs.enchantinginfuser.common.client.EnchantingInfuserClient;
import fuzs.enchantinginfuser.common.data.client.ModAtlasProvider;
import fuzs.enchantinginfuser.common.data.client.ModLanguageProvider;
import fuzs.enchantinginfuser.common.data.client.ModModelProvider;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = EnchantingInfuser.MOD_ID, dist = Dist.CLIENT)
public class EnchantingInfuserNeoForgeClient {

    public EnchantingInfuserNeoForgeClient() {
        ClientModConstructor.construct(EnchantingInfuser.MOD_ID, EnchantingInfuserClient::new);
        DataProviderBuilder.of(EnchantingInfuser.MOD_ID)
                .addProvider(ModLanguageProvider::new, ModAtlasProvider::new, ModModelProvider::new);
    }
}
