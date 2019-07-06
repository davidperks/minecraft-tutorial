package tom.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tom.init.BlockInit;
import tom.world.gen.generators.WorldGenRubyTree;
import tom.world.gen.generators.WorldGenTitaniumTree;

public class WorldGenCustomTrees implements IWorldGenerator
{
	private final WorldGenerator RUBY = new WorldGenRubyTree();
	private final WorldGenerator TITANIUM = new WorldGenTitaniumTree();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			break;
		case 0:
			runGenerator(RUBY, world, random, chunkX, chunkZ, 5, -1, 0, BiomePlains.class);
			runGenerator(TITANIUM, world, random, chunkX, chunkZ, 5, -1, 0, BiomePlains.class);
			break;
		case -1:
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, double chancesToSpawn, int minHeight, int maxHeight, Class<?>... classes)
	{
		if(chancesToSpawn < 1)
		{
			if(rand.nextDouble() < chancesToSpawn) chancesToSpawn = 1;
			else chancesToSpawn = 0;
		}
		
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++)
		{
			BlockPos pos = new BlockPos(chunkX * 16 + 10 + rand.nextInt(15), minHeight + rand.nextInt(heightDiff),chunkZ * 16 + 10 + rand.nextInt(15));
			if(minHeight < 0) pos = world.getHeight(pos);
			Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
			if(classesList.contains(biome)) generator.generate(world, rand, pos);
		}
	}

	public static void register()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomTrees(), 0);
	}
}
