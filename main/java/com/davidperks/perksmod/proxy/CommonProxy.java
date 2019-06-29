package com.davidperks.perksmod.proxy;

import com.davidperks.perksmod.blocks.TitaniumOre;
import com.davidperks.perksmod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class CommonProxy 
{

	public void preInit(FMLPreInitializationEvent event) 
	{
		
		
	}

	public void init(FMLInitializationEvent event) 
	{
	
		
	}

	public void postInit(FMLPostInitializationEvent event) 
	{
	
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(new TitaniumOre());
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new ItemBlock(ModBlocks.titaniumOre).setRegistryName("pm:titaniumOre"));
	}

}
