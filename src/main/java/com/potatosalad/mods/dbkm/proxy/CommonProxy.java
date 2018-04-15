package com.potatosalad.mods.dbkm.proxy;

import com.potatosalad.mods.dbkm.block.ModBlocks;
import com.potatosalad.mods.dbkm.item.ModItems;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	
	public void preinit(FMLPreInitializationEvent PreInitializationEvent) {
		ModBlocks.commonPreinit();
		ModItems.commonPreinit();
	}
	
	public void init(FMLInitializationEvent InitializationEvent) {
	}
	
	public void postinit(FMLPostInitializationEvent PostInitializationEvent) {
	}
}
