package zdoctor.autoforge;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AutoForge.MODID, name = AutoForge.NAME, version = AutoForge.VERSION)
public class AutoForge {
  public static final String MODID = "autoforgelib";
  public static final String NAME = "Auto Forge";
  public static final String VERSION = "1.0";

  public static Logger Logger;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    Logger = event.getModLog();
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
  }
}
