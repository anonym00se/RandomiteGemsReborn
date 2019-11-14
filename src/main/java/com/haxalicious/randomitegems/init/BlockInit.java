package com.haxalicious.randomitegems.init;

import java.util.ArrayList;
import java.util.List;

import com.haxalicious.randomitegems.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block RANDOMITE_ORE = new BlockBase("randomite_ore", Material.ROCK);
}
