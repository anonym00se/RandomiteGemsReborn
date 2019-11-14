package com.haxalicious.randomitegems.init;

import java.util.ArrayList;
import java.util.List;

import com.haxalicious.randomitegems.objects.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item RANDOMITE_GEM = new ItemBase("randomite_gem", CreativeTabs.MATERIALS);

	public static final Item RANDOMITE_AXE = new ItemBase("randomite_axe", CreativeTabs.TOOLS);
	public static final Item RANDOMITE_HOE = new ItemBase("randomite_hoe", CreativeTabs.TOOLS);
	public static final Item RANDOMITE_PICKAXE = new ItemBase("randomite_pickaxe", CreativeTabs.TOOLS);
	public static final Item RANDOMITE_SHOVEL = new ItemBase("randomite_shovel", CreativeTabs.TOOLS);
	public static final Item RANDOMITE_SWORD = new ItemBase("randomite_sword", CreativeTabs.COMBAT);

	public static final Item RANDOMITE_HELMET = new ItemBase("randomite_helmet", CreativeTabs.COMBAT);
	public static final Item RANDOMITE_CHESTPLATE = new ItemBase("randomite_chestplate", CreativeTabs.COMBAT);
	public static final Item RANDOMITE_LEGGINGS = new ItemBase("randomite_leggings", CreativeTabs.COMBAT);
	public static final Item RANDOMITE_BOOTS = new ItemBase("randomite_boots", CreativeTabs.COMBAT);
}
