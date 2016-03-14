package me.jasonlane.myfirstmod;

import me.jasonlane.myfirstmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=MFMGlobal.MOD_ID, name=MFMGlobal.MOD_NAME, version=MFMGlobal.MOD_VERSION)

public class Main {

	@SidedProxy(clientSide = MFMGlobal.MFM_CLIENT_PROXY, serverSide = MFMGlobal.MFM_COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Instance(MFMGlobal.MOD_ID)
	
	public static Main instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		this.proxy.preInit(preEvent);
			}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		this.proxy.init(event);
		System.out.println("!!!!!!!!!!!!!!IS THIS BEING REACHED!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent) {
		this.proxy.postInit(postEvent);
	}	
	
	
	
	
	
}
