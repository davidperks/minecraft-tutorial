package com.davidperks.perksmod.init;

import com.davidperks.perksmod.blocks.TitaniumOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks 
{
	@ObjectHolder("pm:titaniumore")
	public static TitaniumOre titaniumOre;
	
	@SideOnly(Side.CLIENT)
	public static void initModels()
	{
		titaniumOre.initModel();
	}
}