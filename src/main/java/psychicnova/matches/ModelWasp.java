package psychicnova.matches;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWasp extends ModelBase
{
    //fields
    ModelRenderer Thorax;
    ModelRenderer Abdomen;
    ModelRenderer Head_Front;
    ModelRenderer rightarm;
    ModelRenderer Head_Back;
    ModelRenderer Stinger;
    ModelRenderer Wing_2;
    ModelRenderer Wing_1;

    public ModelWasp()
    {
        textureWidth = 64;
        textureHeight = 32;

        Thorax = new ModelRenderer(this, 40, 16);
        Thorax.addBox(-3F, -2F, -2F, 2, 3, 2);
        Thorax.setRotationPoint(-3F, 4F, 0F);
        Thorax.setTextureSize(64, 32);
        Thorax.mirror = true;
        setRotation(Thorax, 0F, 0F, -0.5061455F);
        Abdomen = new ModelRenderer(this, 40, 16);
        Abdomen.addBox(-2F, -2F, -2F, 2, 4, 2);
        Abdomen.setRotationPoint(-4F, 2F, 0F);
        Abdomen.setTextureSize(64, 32);
        Abdomen.mirror = true;
        setRotation(Abdomen, 0F, 0F, 0.3665191F);
        Head_Front = new ModelRenderer(this, 40, 16);
        Head_Front.addBox(0F, 0F, 0F, 2, 2, 2);
        Head_Front.setRotationPoint(-3F, -1F, -2F);
        Head_Front.setTextureSize(64, 32);
        Head_Front.mirror = true;
        setRotation(Head_Front, 0.0174533F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(0F, 0F, 0F, 0, 1, 0);
        rightarm.setRotationPoint(0F, 0F, 0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, -0.5061455F);
        Head_Back = new ModelRenderer(this, 40, 16);
        Head_Back.addBox(0F, 0F, 0F, 2, 2, 2);
        Head_Back.setRotationPoint(-5F, -1F, -2F);
        Head_Back.setTextureSize(64, 32);
        Head_Back.mirror = true;
        setRotation(Head_Back, 0.0174533F, 0F, 0F);
        Stinger = new ModelRenderer(this, 40, 16);
        Stinger.addBox(0F, 0F, 0F, 1, 2, 1);
        Stinger.setRotationPoint(-5F, 6F, -1F);
        Stinger.setTextureSize(64, 32);
        setRotation(Stinger, 0F, 0F, -0.4886922F);
        Stinger.mirror = false;
        Wing_2 = new ModelRenderer(this, 40, 16);
        Wing_2.addBox(0F, 0F, 0F, 2, 3, 0);
        Wing_2.setRotationPoint(-8F, 0F, 0F);
        Wing_2.setTextureSize(64, 32);
        Wing_2.mirror = true;
        setRotation(Wing_2, 0F, 0F, -0.6632251F);
        Wing_1 = new ModelRenderer(this, 40, 16);
        Wing_1.addBox(0F, 0F, 0F, 2, 3, 0);
        Wing_1.setRotationPoint(-8F, 0F, -2F);
        Wing_1.setTextureSize(64, 32);
        Wing_1.mirror = true;
        setRotation(Wing_1, 0F, 0F, -0.6632251F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Thorax.render(f5);
        Abdomen.render(f5);
        Head_Front.render(f5);
        rightarm.render(f5);
        Head_Back.render(f5);
        Stinger.render(f5);
        Wing_2.render(f5);
        Wing_1.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
