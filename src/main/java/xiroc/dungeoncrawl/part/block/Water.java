package xiroc.dungeoncrawl.part.block;

/*
 * DungeonCrawl (C) 2019 - 2020 XYROC (XIROC1337), All Rights Reserved 
 */

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import xiroc.dungeoncrawl.dungeon.treasure.Treasure.Type;
import xiroc.dungeoncrawl.util.IBlockPlacementHandler;

public class Water implements IBlockPlacementHandler {

	private static final BlockState LAVA = Blocks.LAVA.getDefaultState();

	@Override
	public void setupBlock(IWorld world, BlockState state, BlockPos pos, Random rand, Type treasureType, int theme,
			int lootLevel) {
		if (theme == 1)
			world.setBlockState(pos, LAVA, 2);
		else
			world.setBlockState(pos, state, 2);

	}

}
