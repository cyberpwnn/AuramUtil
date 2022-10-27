package org.cyberpwn.auramutils;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.cyberpwn.auramutils.config.AuramUtilsConfig;

@Mod(modid = org.cyberpwn.auramutils.AuramUtils.MODID, name = org.cyberpwn.auramutils.AuramUtils.NAME, version = org.cyberpwn.auramutils.AuramUtils.VERSION, useMetadata = true)
public class AuramUtils
{
    public static final String MODID = "auramutils";
    public static final String NAME = "Auram Utils";
    public static final String VERSION = "@VERSION@";

    public AuramUtils() {

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if(event.getModID().equals(MODID)) {
            AuramUtilsConfig.syncConfig();
        }
    }

    @EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        if(AuramUtilsConfig.startupGc) {
            System.gc();
        }
    }
}
