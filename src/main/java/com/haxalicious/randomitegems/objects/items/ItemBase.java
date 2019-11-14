package com.haxalicious.randomitegems.objects.items;

import com.haxalicious.randomitegems.Main;
import com.haxalicious.randomitegems.init.ItemInit;
import com.haxalicious.randomitegems.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
