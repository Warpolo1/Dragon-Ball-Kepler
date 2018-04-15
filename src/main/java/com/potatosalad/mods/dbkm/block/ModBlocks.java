package com.potatosalad.mods.dbkm.block;

import java.util.HashMap;

import com.potatosalad.mods.dbkm.Reference;
import com.potatosalad.mods.dbkm.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	private static final HashMap<Block, Item> blocks = new HashMap<Block, Item>();
	private static Block namek_grass;
	private static Block namek_dirt;
	
	public static final void commonPreinit() {
		namek_dirt = registerBlock(new Block(Material.GROUND), "namek_dirt");
		namek_grass = registerBlock(new Block(Material.GRASS), "namek_grass");
	}
	
		private static final Block registerBlock(Block block, String name) {
		block.setUnlocalizedName(name);
		GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID, name));
		Item blockItem = ModItems.registerItem(new ItemBlock(block), name);
		blocks.put(block, blockItem);
		return block;
	}	
}
