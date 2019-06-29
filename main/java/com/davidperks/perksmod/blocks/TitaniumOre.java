package com.davidperks.perksmod.blocks;

import com.davidperks.perksmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TitaniumOre extends BlockOre
{

	public TitaniumOre() {
		super();
		this.setHardness(2F);
		this.setHarvestLevel("pickaxe", 3);
		this.setResistance(15);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel()
	{
		ModelLoader.setCustomModelResourceLocation(new ItemBlock(this), 0, new ModelResourceLocation("inventory"));
	}

}
