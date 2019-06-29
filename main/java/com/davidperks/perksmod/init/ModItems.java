package com.davidperks.perksmod.init;

import com.davidperks.perksmod.blocks.TitaniumOre;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
	public static final ToolMaterial MATERIAL_TITANIUM =
			EnumHelper.addToolMaterial("material_titanium", 3, 250, 8.0F, 6.0F, 10);
	
	@ObjectHolder("pm:titaniumore")
	public static TitaniumOre titaniumOre;
	
	@SideOnly(Side.CLIENT)
	public static void initModels()
	{
		titaniumOre.initModel();
	}
}
