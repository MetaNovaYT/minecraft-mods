package psychicnova.matches;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

import psychicnova.utils.Point;
import psychicnova.utils.EntityUtils;

public class WaspHiveTileEntity extends TileEntity {
    public static int NUMBER_OF_WASPS_IN_HIVE = 10;
    public static int WASP_SPAWN_FREQUENCY = 25;

    private int delay = 0;
    private int waspCount = NUMBER_OF_WASPS_IN_HIVE;

    public WaspHiveTileEntity() {
        super();
    }

    @Override
    public void updateEntity() {
        maybeSpawnWasp();
        super.updateEntity();
    }

    /**
     * Spawns a wasp periodically when a player is within range.
     */
    public void maybeSpawnWasp() {
        World world = getWorldObj();
        Point spawnPoint = getNextSpawnPoint();
        if (spawnPoint != null && shouldSpawnWasp(spawnPoint)) {
            WaspEntity wasp = new WaspEntity(world);
            EntityUtils.spawn(world, wasp, spawnPoint);
            this.waspCount--;
            delay = 10;
        }
        delay--;
    }

    /** Returns true if the hive should spawn a wasp now. */
    public boolean shouldSpawnWasp(Point spawnPoint) {
        World world = getWorldObj();
        if (this.waspCount < 0 || delay > 0)
            return false;
        if (new Random().nextInt(WASP_SPAWN_FREQUENCY) != 0)
            return false;
        return EntityUtils.anyPlayerInRange(world, spawnPoint);
    }

    public Point getNextSpawnPoint() {
        World world = getWorldObj();
        Point pointAbove = EntityUtils.getPointAbove(this);
        if (EntityUtils.canSpawnTo(world, pointAbove)) {
            return pointAbove;
        }
        return null;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setInteger("delay", this.delay);
        nbt.setInteger("waspCount", this.waspCount);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.delay = nbt.getInteger("delay");
        this.waspCount = nbt.getInteger("waspCount");
    }
}
