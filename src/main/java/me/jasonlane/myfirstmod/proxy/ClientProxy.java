package me.jasonlane.myfirstmod.proxy;

import me.jasonlane.myfirstmod.render.MFMBlockRender;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
		System.out.println("!!!!!!!REACHED CLIENTPROXY PREINIT!!!!!!");
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
		MFMBlockRender.registerBlockRender();
		System.out.println("!!!!!!!REACHED CLIENTPROXY INIT!!!!!!");
		
		
		
	}
	public void postEvent(FMLPostInitializationEvent postEvent) {
		super.postInit(postEvent);
	}

}
