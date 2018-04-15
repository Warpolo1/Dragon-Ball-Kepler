package com.potatosalad.mods.dbkm.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy{

	public void preinit(FMLPreInitializationEvent PreInitializationEvent) {
		super.preinit(PreInitializationEvent);
	}
	
	public void init(FMLInitializationEvent InitializationEvent) {
		super.init(InitializationEvent);
	}
	
	public void postinit(FMLPostInitializationEvent PostInitializationEvent) {
		super.postinit(PostInitializationEvent);
	}
}
