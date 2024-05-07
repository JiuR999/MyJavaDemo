package com.example;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class Demo extends JavaPlugin {
    public static final Demo INSTANCE = new Demo();

    private Demo() {
        super(new JvmPluginDescriptionBuilder("com.example.demo", "0.1.0")
                .name("Demo")
                .author("ASUS")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
    }
}