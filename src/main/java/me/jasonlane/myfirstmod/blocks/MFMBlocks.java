package me.jasonlane.myfirstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MFMBlocks {
	
	public static Block copperOre;
	
	public static void initBlocks() {
		//Ores
		GameRegistry.registerBlock(copperOre = new MFMBlock("copperOre", Material.rock, 3, 15),"copperOre");
	}
	
	
}

