package psychicnova.matches;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.entity.monster.*;


public class WaspEntity extends EntityMob {
    public WaspEntity(World par1World) {
        super(par1World);

//        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false));
//        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
//        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
//        this.tasks.addTask(4, new EntityAILookIdle(this));
//
//        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
//        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0D);
        getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(15.0D);
        getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(.85D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(.28D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
    }

    @Override
    protected boolean isAIEnabled() {
        return false;
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float par1, float par2)
    {
        if (this.isInWater())
        {
            this.moveFlying(par1, par2, 0.02F);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.800000011920929D;
            this.motionY *= 0.800000011920929D;
            this.motionZ *= 0.800000011920929D;
        }
        else if (this.handleLavaMovement())
        {
            this.moveFlying(par1, par2, 0.02F);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.5D;
            this.motionY *= 0.5D;
            this.motionZ *= 0.5D;
        }
        else
        {
            float f2 = 0.91F;
            par1 = 10.0F;

            if (this.onGround)
            {
                f2 = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ)).slipperiness * 0.91F;
            }

            float f3 = 0.16277136F / (f2 * f2 * f2);
            this.moveFlying(par1, par2, this.onGround ? 0.1F * f3 : 0.02F);
            f2 = 0.91F;

            if (this.onGround)
            {
                f2 = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ)).slipperiness * 0.91F;
            }

            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double)f2;
            this.motionY *= (double)f2;
            this.motionZ *= (double)f2;
        }

        this.prevLimbSwingAmount = this.limbSwingAmount;
        double d1 = this.posX - this.prevPosX;
        double d0 = this.posZ - this.prevPosZ;
        float f4 = MathHelper.sqrt_double(d1 * d1 + d0 * d0) * 4.0F;

        if (f4 > 1.0F)
        {
            f4 = 1.0F;
        }

        this.limbSwingAmount += (f4 - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;
    }
}
