package me.fivekfubi.api;

import org.bukkit.entity.Player;

import java.util.List;

public interface BaseRaidersProvider {
    void test();

    
    List<String> get_player_protection_nicks_test(Player player);
}
