package fuzs.enchantinginfuser.common.client;

import fuzs.enchantinginfuser.common.client.gui.screens.inventory.InfuserScreen;
import fuzs.enchantinginfuser.common.client.renderer.blockentity.InfuserRenderer;
import fuzs.enchantinginfuser.common.init.ModRegistry;
import fuzs.enchantinginfuser.common.world.level.block.InfuserBlock;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.common.api.client.core.v1.context.BlockEntityRenderersContext;
import fuzs.puzzleslib.common.api.client.core.v1.context.MenuScreensContext;
import fuzs.puzzleslib.common.api.client.gui.v2.tooltip.ItemTooltipRegistry;

public class EnchantingInfuserClient implements ClientModConstructor {

    @Override
    public void onClientSetup() {
        ItemTooltipRegistry.BLOCK.registerItemTooltip(InfuserBlock.class, InfuserBlock::getDescriptionComponent);
    }

    @Override
    public void onRegisterMenuScreens(MenuScreensContext context) {
        context.registerMenuScreen(ModRegistry.INFUSING_MENU_TYPE.value(), InfuserScreen::new);
    }

    @Override
    public void onRegisterBlockEntityRenderers(BlockEntityRenderersContext context) {
        context.registerBlockEntityRenderer(ModRegistry.INFUSER_BLOCK_ENTITY_TYPE.value(), InfuserRenderer::new);
    }
}
