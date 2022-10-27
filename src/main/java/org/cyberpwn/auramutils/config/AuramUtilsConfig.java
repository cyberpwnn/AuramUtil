package org.cyberpwn.auramutils.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;

@Config(modid = org.cyberpwn.auramutils.AuramUtils.MODID)
public class AuramUtilsConfig {
    @Config.Name("Startup GC")
    @Config.Comment("Call System.gc() after startup in the main menu. This helps flush out some resources and get a bit more eden space.")
    public static boolean startupGc = true;

    public static void load(final Configuration config) {

    }

    public static void syncConfig() {
        System.out.println("Auram Utils Configuration Updated");
        ConfigManager.sync(org.cyberpwn.auramutils.AuramUtils.MODID, Config.Type.INSTANCE);
    }
}
