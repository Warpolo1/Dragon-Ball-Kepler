package com.potatosalad.mods.dbkm.item;

import java.util.ArrayList;
import java.util.List;

import com.potatosalad.mods.dbkm.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static final List<Item> items = new ArrayList<Item>();
	public static Item zSword;
	
	
	public static final void commonPreinit() {
		zSword = registerItem(new Item(), "z_sword");
		
	}

	public static final void clientInit() {
		for(Item item : items ) {
			registerRenders(item);
		}
	}
	
	private static void registerRenders(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getRegistryName().getResourcePath(), "inventory"));
	}

	public static final Item registerItem(Item item, String name) {
		item.setUnlocalizedName(name);
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, name));
		items.add(item);
		return item;
	}
}
