package zdoctor.autoforge;

import java.io.IOException;

import org.apache.logging.log4j.Level;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@EventBusSubscriber
public class ClientForgeRegistry extends CommonForgeRegistry {

  @SubscribeEvent
  public static void RegisterItems(ModelRegistryEvent event) {
    AutoForge.Logger.log(Level.INFO, "Registering Items Models");
    registeredItems.forEach(item -> {
      ModelResourceLocation modelLocation;
      if (item.getHasSubtypes()) {
        for (int i = 0; i < item.VaritantCount(); i++) {

        }
      } else {
        ModelLoader.setCustomModelResourceLocation(item, 0, modelLocation = item.GetModelLocation(0));
        Log(modelLocation);
      }

    });
  }

  private static void Log(ModelResourceLocation modelLocation) {
    if (modelLocation == null)
      AutoForge.Logger.log(Level.INFO, "Attempted to Log Null ModelLocation");
    else {
      String path = String.format("assets/%s/models/item/%s.json", modelLocation.getResourceDomain(), modelLocation.getResourcePath());
      AutoForge.Logger.log(Level.INFO, String.format("Looking for '%s'", path));
    }
  }
}
