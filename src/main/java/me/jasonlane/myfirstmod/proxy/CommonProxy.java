package me.jasonlane.myfirstmod.proxy;

import me.jasonlane.myfirstmod.blocks.MFMBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent preEvent) {
		MFMBlocks.initBlocks();
	}
	public void init(FMLInitializationEvent event) {}
	public void postInit(FMLPostInitializationEvent postEvent) {}

}
