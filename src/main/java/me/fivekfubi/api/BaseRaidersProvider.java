package me.fivekfubi.api;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

public interface BaseRaidersProvider {
    void test();

    List<String> get_player_protection_nicks_test(Player player);

    Map<String, I_DATA_Protection> get_protection_database_cache();
}
