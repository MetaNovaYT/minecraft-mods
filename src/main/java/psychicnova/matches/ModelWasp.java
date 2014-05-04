package psychicnova.matches;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWasp extends ModelBase
{
  //fields
    ModelRenderer Thorax;
    ModelRenderer Abdomen;
    ModelRenderer Head;
    ModelRenderer Stinger;
    ModelRenderer Wing_2;
    ModelRenderer Wing_1;
  
  public ModelWasp()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Thorax = new ModelRenderer(this, 40, 16);
      Thorax.addBox(-3F, -2F, -2F, 2, 3, 2);
      Thorax.setRotationPoint(-3F, 17F, 0F);
      Thorax.setTextureSize(128, 64);
      Thorax.mirror = true;
      setRotation(Thorax, 0F, 0F, -0.5061455F);
      Abdomen = new ModelRenderer(this, 40, 16);
      Abdomen.addBox(-2F, -2F, -2F, 2, 4, 2);
      Abdomen.setRotationPoint(-4F, 15F, 0F);
      Abdomen.setTextureSize(128, 64);
      Abdomen.mirror = true;
      setRotation(Abdomen, 0F, 0F, 0.3665191F);
      Head = new ModelRenderer(this, 40, 16);
      Head.addBox(0F, 0F, 0F, 4, 2, 2);
      Head.setRotationPoint(-5F, 12F, -2F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0.0174533F, 0F, 0F);
      Stinger = new ModelRenderer(this, 40, 16);
      Stinger.addBox(0F, 0F, 0F, 1, 2, 1);
      Stinger.setRotationPoint(-5F, 19F, -1F);
      Stinger.setTextureSize(128, 64);
      Stinger.mirror = true;
      setRotation(Stinger, 0F, 0F, -0.4886922F);
      Wing_2 = new ModelRenderer(this, 40, 16);
      Wing_2.addBox(0F, 0F, 0F, 2, 3, 0);
      Wing_2.setRotationPoint(-8F, 13F, 0F);
      Wing_2.setTextureSize(128, 64);
      Wing_2.mirror = true;
      setRotation(Wing_2, 0F, 0F, -0.6632251F);
      Wing_1 = new ModelRenderer(this, 40, 16);
      Wing_1.addBox(0F, 0F, 0F, 2, 3, 0);
      Wing_1.setRotationPoint(-8F, 13F, -2F);
      Wing_1.setTextureSize(128, 64);
      Wing_1.mirror = true;
      setRotation(Wing_1, 0F, 0F, -0.6632251F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Thorax.render(f5);
    Abdomen.render(f5);
    Head.render(f5);
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
}
