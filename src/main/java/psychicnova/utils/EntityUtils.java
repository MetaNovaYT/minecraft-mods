package psychicnova.utils;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Useful utilities for managing entities.
 */
public class EntityUtils {
    public static double PLAYER_DETECTION_RANGE = 16;

    /** Returns the point directly above the specified entity. */
    public static Point getPointAbove(TileEntity entity) {
        return new Point(entity.xCoord, entity.yCoord + 1, entity.zCoord);
    }

    /** Returns true if it is safe to spawn to the specified point. */
    public static boolean canSpawnTo(World world, Point point) {
        Block block = world.getBlock(point.x, point.y, point.z);
        return block == null || block == Blocks.air;
    }

    /** Spawns an entity at the specified point. */
    public static void spawn(World world, Entity entity, Point point) {
        entity.setLocationAndAngles(point.x, point.y, point.z, 0.0F, 0.0F);
        world.spawnEntityInWorld(entity);
    }

    /** Returns true if any player is within range. */
    public static boolean anyPlayerInRange(World world, Point point) {
        return world.getClosestPlayer(point.x, point.y, point.z, PLAYER_DETECTION_RANGE) != null;
    }
}
