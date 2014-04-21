package psychicnova.matches;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MNovaEntity extends EntityMob {
    public MNovaEntity(World par1World) {
        super(par1World);

        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));

        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));

    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
        getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(15.0D);
        getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(.10D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(.28D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }
}
