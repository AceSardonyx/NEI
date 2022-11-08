
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.hasco.nei.world.inventory.TestDogGUIMenu;
import net.hasco.nei.world.inventory.InformationNEIMenu;
import net.hasco.nei.NeiMod;

public class NeiModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NeiMod.MODID);
	public static final RegistryObject<MenuType<TestDogGUIMenu>> TEST_DOG_GUI = REGISTRY.register("test_dog_gui",
			() -> IForgeMenuType.create(TestDogGUIMenu::new));
	public static final RegistryObject<MenuType<InformationNEIMenu>> INFORMATION_NEI = REGISTRY.register("information_nei",
			() -> IForgeMenuType.create(InformationNEIMenu::new));
}
