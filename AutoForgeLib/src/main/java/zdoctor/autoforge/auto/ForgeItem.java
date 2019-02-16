package zdoctor.autoforge.auto;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import zdoctor.autoforge.CommonForgeRegistry;

public class ForgeItem extends Item {
  
  public int variants;
  
  public ForgeItem(ResourceLocation resourceLocation) {
    setUnlocalizedName(resourceLocation.getResourcePath());
    setRegistryName(resourceLocation);
    setCreativeTab(CreativeTabs.MISC);
    CommonForgeRegistry.Register(this);
  }
  
  public ForgeItem(String unlocalizedName) {
    setUnlocalizedName(unlocalizedName);
    setRegistryName(unlocalizedName);
    setCreativeTab(CreativeTabs.MISC);
    CommonForgeRegistry.Register(this);
  }
  
  public ModelResourceLocation GetModelLocation(int meta) {
    return new ModelResourceLocation(getRegistryName(), "inventory");
  }
  
  public int VaritantCount() {
    return variants;
  }
}
