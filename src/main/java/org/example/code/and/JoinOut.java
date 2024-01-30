package org.example.code.and;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.code.and.Listener.RightClickItemListener;

public final class JoinOut extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getLogger().info("JoinOut Plugin 이(가) 활성화 되었습니다.");
        getServer().getPluginManager().registerEvents(new RightClickItemListener(),this);
    }

    @Override
    public void onDisable() {
        getLogger().info("JoinOut Plugin 이(가) 비활성화 되었습니다.");
    }

}