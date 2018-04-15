package com.potatosalad.mods.dbkm;

import com.potatosalad.mods.dbkm.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME, modid = Reference.MOD_ID, acceptedMinecraftVersions = Reference.MC_VERSION, version = Reference.MOD_VERSION, useMetadata = true )
public class DragonBallKepler {

	@Instance
	public static DragonBallKepler instance;
	
	@SidedProxy(clientSide = Reference.PROXY_BASE + ".ClientProxy", serverSide = Reference.PROXY_BASE + ".ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent PreInitializationEvent) {
		proxy.preinit(PreInitializationEvent);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent InitializationEvent) {
		proxy.init(InitializationEvent);
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent PostInitializationEvent) {
		proxy.postinit(PostInitializationEvent);
	}
}
