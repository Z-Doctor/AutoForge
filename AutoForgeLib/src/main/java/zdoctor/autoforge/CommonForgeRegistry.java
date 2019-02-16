/**
 * Doc: https://mcforge.readthedocs.io/en/latest/concepts/registries/
 * Supported Registries: Block, Item, Potion, Biome, SoundEvent, PotionType, Enchantment, 
 *                       IRecipe, VillagerProfession, EntityEntry
 */
package zdoctor.autoforge;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import zdoctor.autoforge.auto.ForgeItem;

@EventBusSubscriber
public class CommonForgeRegistry {

  protected static List<ForgeItem> registeredItems = new ArrayList<>();

  @SubscribeEvent
  public static void RegisterItems(RegistryEvent.Register<Item> event) {
    AutoForge.Logger.debug("Registering Items");
    IForgeRegistry<Item> itemRegistry = event.getRegistry();
    itemRegistry.registerAll(registeredItems.toArray(new ForgeItem[0]));
  }

  public static void Register(ForgeItem item) {
    AutoForge.Logger.debug("Registered: " + item);
    registeredItems.add(item);
  }
}
