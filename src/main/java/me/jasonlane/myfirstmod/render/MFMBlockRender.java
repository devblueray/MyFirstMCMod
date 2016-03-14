package me.jasonlane.myfirstmod.render;

import me.jasonlane.myfirstmod.MFMGlobal;
import me.jasonlane.myfirstmod.blocks.MFMBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class MFMBlockRender {
	public static void registerBlockRender() {
		//Ores
		regBlock(MFMBlocks.copperOre);
		
	}
	
	public static void regBlock (Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0, new ModelResourceLocation(MFMGlobal.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory" ));
	}
}
