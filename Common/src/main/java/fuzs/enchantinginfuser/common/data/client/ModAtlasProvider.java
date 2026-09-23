package fuzs.enchantinginfuser.common.data.client;

import fuzs.enchantinginfuser.common.client.renderer.blockentity.InfuserRenderer;
import fuzs.puzzleslib.common.api.client.data.v3.atlas.AbstractAtlasProvider;
import fuzs.puzzleslib.common.api.data.v3.core.DataProviderContext;

public class ModAtlasProvider extends AbstractAtlasProvider {

    public ModAtlasProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addAtlases() {
        this.addMaterial(InfuserRenderer.BOOK_TEXTURE);
    }
}
