package me.jasonlane.myfirstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MFMBlock extends Block {

		public MFMBlock(String unlocalizedName, Material material, float hardness, float resistance) {
			super(material);
			this.setUnlocalizedName(unlocalizedName);
			this.setHardness(hardness);
			this.setResistance(resistance);
			this.setCreativeTab(CreativeTabs.tabMaterials);
			System.out.println("THIS IS A MESSAGE FROM INSIDE THE MFMBlock CLASS!!!!!!!");
		}
		

}
