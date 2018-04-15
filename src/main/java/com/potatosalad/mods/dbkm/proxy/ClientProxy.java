package com.potatosalad.mods.dbkm.proxy;

import com.potatosalad.mods.dbkm.block.ModBlocks;
import com.potatosalad.mods.dbkm.item.ModItems;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preinit(FMLPreInitializationEvent PreInitializationEvent) {
		super.preinit(PreInitializationEvent);
	}
	
	public void init(FMLInitializationEvent InitializationEvent) {
		super.init(InitializationEvent);
		ModItems.clientInit();
	}
	
	public void postinit(FMLPostInitializationEvent PostInitializationEvent) {
		super.postinit(PostInitializationEvent);
	}
}
