package me.fivekfubi.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface BaseRaidersProvider {
    void test();

    List<String> get_player_protection_nicks_test(Player player);

    Map<String, I_DATA_Protection> get_protection_database_cache();

    boolean has_permission(Player player, Location event_location, String permission);
    boolean has_permission(UUID uuid, Location event_location, String permission);
    boolean has_permission(String uuid_string, Location event_location, String permission);
}
