package fuzs.enchantinginfuser.common.config;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

import java.util.function.Predicate;

public enum ModifiableItems {
    UNENCHANTED(ItemStack::isEnchantable),
    ALL(ModifiableItems::isItemEnchantableOrEnchanted),
    FULL_DURABILITY((ItemStack itemStack) -> !itemStack.isDamaged() && isItemEnchantableOrEnchanted(itemStack));

    public final Predicate<ItemStack> predicate;

    ModifiableItems(Predicate<ItemStack> predicate) {
        this.predicate = predicate;
    }

    /**
     * Do not use {@link ItemStack#isEnchantable()} as it requires
     * {@link net.minecraft.core.component.DataComponents#ENCHANTABLE} to be present, which e.g., the elytra does not
     * have.
     */
    private static boolean isItemEnchantableOrEnchanted(ItemStack itemStack) {
        return EnchantmentHelper.canStoreEnchantments(itemStack) || itemStack.isEnchanted();
    }
}
