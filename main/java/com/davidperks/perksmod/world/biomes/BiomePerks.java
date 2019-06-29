package com.davidperks.perksmod.world.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomePerks extends Biome
{
	//test biome 
	//how to get it to be the biome??
	public BiomePerks(BiomeProperties properties) {
		super(properties);
		this.spawnableCreatureList.clear();
		this.topBlock = Blocks.IRON_BLOCK.getDefaultState();
		this.fillerBlock = Blocks.IRON_BLOCK.getDefaultState();
		this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 0;
        this.decorator.reedsPerChunk = 0;
        this.decorator.cactiPerChunk = 0;
	}

}
