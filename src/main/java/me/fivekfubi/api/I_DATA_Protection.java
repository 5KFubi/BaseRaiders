package me.fivekfubi.api;

//import me.fivekfubi.baseraiders.Attribute.DATA_Upgrade;
//import me.fivekfubi.baseraiders.Dependencies.Required.Vault.Data.ECO_Price;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public interface I_DATA_Protection {

    String get_id();
    void set_id(String id);

    long get_current_tick();
    void set_current_tick(long current_tick);

    long get_damaged_timer();
    void set_damaged_timer(long damaged_timer);

    String get_world();
    void set_world(String world);

    int get_chunk_x();
    void set_chunk_x(int chunk_x);

    int get_chunk_z();
    void set_chunk_z(int chunk_z);

    int get_location_x();
    void set_location_x(int location_x);

    int get_location_y();
    void set_location_y(int location_y);

    int get_location_z();
    void set_location_z(int location_z);

    String get_owner_name();
    void set_owner_name(String owner_name);

    String get_owner_uuid();
    void set_owner_uuid(String owner_uuid);

    String get_protection_name();
    void set_protection_name(String protection_name);

    String get_status();
    void set_status(String status);

    String get_upgrades();
    void set_upgrades(String upgrades);

    String get_storage_items();
    void set_storage_items(String storage_items);

    String get_members();
    void set_members(String members);

    int get_health();
    void set_health(int health);

    int get_fuel();
    void set_fuel(int fuel);

    long get_fuel_timer();
    void set_fuel_timer(long fuel_timer);

    int get_generator_stored_money();
    void set_generator_stored_money(int generator_stored_money);

    String get_generator_stored_items();
    void set_generator_stored_items(String generator_stored_items);

    long get_generator_timer_money();
    void set_generator_timer_money(long generator_timer_money);

    long get_generator_timer_items();
    void set_generator_timer_items(long generator_timer_items);

    long get_decay_timer();
    void set_decay_timer(long decay_timer);

    String get_member_outsider_id();
    void set_member_outsider_id(String member_outsider_id);

    String get_member_protection_id();
    void set_member_protection_id(String member_protection_id);

    Map<String, String> get_members_map();
    //void add_member_map(String player_uuid, DATA_Member member_data);
    void remove_member_map(String player_uuid);
    //void remove_member_map(DATA_Member member_data);
    String get_member(String player_uuid);
    void update_members_database();

    // CACHE METHODS
    Location get_location();
    void set_location(Location location);

    String get_c_file_path();
    void set_c_file_path(String c_file_path);

    String get_c_default_status();
    void set_c_default_status(String c_default_status);

    List<String> get_c_world_whitelist();
    void set_c_world_whitelist(List<String> c_world_whitelist);

    String get_c_block_material();
    void set_c_block_material(String c_block_material);

    double get_c_particle_display_range();
    void set_c_particle_display_range(double c_particle_display_range);

    long get_c_particle_display_interval();
    void set_c_particle_display_interval(long c_particle_display_interval);

    String get_c_particle_member_file_path();
    void set_c_particle_member_file_path(String c_particle_member_file_path);

    String get_c_particle_outsider_file_path();
    void set_c_particle_outsider_file_path(String c_particle_outsider_file_path);

    String get_c_rank_default_owner();
    void set_c_rank_default_owner(String c_rank_default_owner);

    String get_c_rank_default_member();
    void set_c_rank_default_member(String c_rank_default_member);

    String get_c_rank_default_outsider();
    void set_c_rank_default_outsider(String c_rank_default_outsider);

    String get_c_rank_default_protection();
    void set_c_rank_default_protection(String c_rank_default_protection);

    List<String> get_c_rank_available();
    void set_c_rank_available(List<String> c_rank_available);

    int get_c_health_amount();
    void set_c_health_amount(int c_health_amount);

    int get_c_health_capacity();
    void set_c_health_capacity(int c_health_capacity);

    int get_c_regen_amount();
    void set_c_regen_amount(int c_regen_amount);

    long get_c_regen_interval();
    void set_c_regen_interval(long c_regen_interval);

    long get_c_regen_damage_delay();
    void set_c_regen_damage_delay(long c_regen_damage_delay);

    int get_c_range_amount();
    void set_c_range_amount(int c_range_amount);

    boolean get_c_range_infinite_y();
    void set_c_range_infinite_y(boolean c_range_infinite_y);

    double get_c_generator_money_amount();
    void set_c_generator_money_amount(int c_generator_money_amount);

    long get_c_generator_money_interval();
    void set_c_generator_money_interval(long c_generator_money_interval);

    long get_c_generator_item_interval();
    void set_c_generator_item_interval(long c_generator_item_interval);

    //Map<String, DATA_Generator_item> get_c_generator_items_generate();
    //void set_c_generator_items_generate(Map<String, DATA_Generator_item> c_generator_items_generate);

    double get_c_generator_money_capacity();
    void set_c_generator_money_capacity(int c_generator_slot_capacity);

    int get_c_generator_slot_capacity();
    void set_c_generator_slot_capacity(int c_generator_slot_capacity);

    int get_c_storage_slot_capacity();
    void set_c_storage_slot_capacity(int c_storage_slot_capacity);

    int get_c_fuel_amount();
    void set_c_fuel_amount(int c_fuel_amount);

    int get_c_fuel_capacity();
    void set_c_fuel_capacity(int c_fuel_capacity);

    long get_c_fuel_consume_interval();
    void set_c_fuel_consume_interval(long c_fuel_consume_interval);

    //ECO_Price get_c_fuel_eco_price();
    //void set_c_fuel_eco_price(ECO_Price c_fuel_eco_price);

    long get_c_decay_interval();
    void set_c_decay_interval(long c_decay_interval);

    //ECO_Price get_c_decay_eco_price();
    //void set_c_decay_eco_price(ECO_Price c_decay_eco_price);

    int get_c_decay_redeem_fuel_modify();
    void set_c_decay_redeem_fuel_modify(int c_decay_redeem_fuel_modify);

    double get_c_decay_redeem_fuel_multiply();
    void set_c_decay_redeem_fuel_multiply(double c_decay_redeem_fuel_multiply);

    int get_c_decay_redeem_health_modify();
    void set_c_decay_redeem_health_modify(int c_decay_redeem_health_modify);

    double get_c_decay_redeem_health_multiply();
    void set_c_decay_redeem_health_multiply(double c_decay_redeem_health_multiply);

    int get_c_decay_redeem_generator_money_modify();
    void set_c_decay_redeem_generator_money_modify(int c_decay_redeem_generator_money_modify);

    double get_c_decay_redeem_generator_money_multiply();
    void set_c_decay_redeem_generator_money_multiply(double c_decay_redeem_generator_money_multiply);

    int get_c_decay_redeem_generator_items_modify();
    void set_c_decay_redeem_generator_items_modify(int c_decay_redeem_generator_items_modify);

    double get_c_decay_redeem_generator_items_multiply();
    void set_c_decay_redeem_generator_items_multiply(double c_decay_redeem_generator_items_multiply);

    double get_c_decay_redeem_storage_remove_items_amount();
    void set_c_decay_redeem_storage_remove_items_amount(double c_decay_redeem_storage_remove_items_amount);

    boolean get_c_decay_redeem_decay_timer_reset();
    void set_c_decay_redeem_decay_timer_reset(boolean c_decay_redeem_decay_timer_reset);

    int get_c_trap_radius();
    void set_c_trap_radius(int c_trap_radius);

    int get_c_trap_player_cooldown();
    void set_c_trap_player_cooldown(int c_trap_player_cooldown);

    String get_c_trap_events_on_entry_executables();
    void set_c_trap_events_on_entry_executables(String c_trap_events_on_entry_executables);

    int get_c_damage_blast();
    void set_c_damage_blast(int c_damage_blast);

    int get_c_damage_tool();
    void set_c_damage_tool(int c_damage_tool);

    int get_c_damage_none();
    void set_c_damage_none(int c_damage_none);

    int get_c_defense_amount();
    void set_c_defense_amount(int c_defense_amount);

    int get_c_defense_capacity();
    void set_c_defense_capacity(int c_defense_capacity);

    int get_c_defense_scaling_factor();
    void set_c_defense_scaling_factor(int c_defense_scaling_factor);


    double get_c_crops_growth_speed_multiplier();
    void set_c_crops_growth_speed_multiplier(double c_crops_growth_speed_multiplier);

    double get_c_crops_yield_bonus_chance();
    void set_c_crops_yield_bonus_chance(double c_crops_yield_bonus_chance);

    double get_c_crops_yield_bonus_multiplier();
    void set_c_crops_yield_bonus_multiplier(double c_crops_yield_bonus_multiplier);

    double get_c_crops_multi_harvest_chance();
    void set_c_crops_multi_harvest_chance(double c_crops_multi_harvest_chance);

    double get_c_crops_multi_harvest_multiplier();
    void set_c_crops_multi_harvest_multiplier(double c_crops_multi_harvest_multiplier);

    double get_c_crops_fertilizer_efficiency_chance();
    void set_c_crops_fertilizer_efficiency_chance(double c_crops_fertilizer_efficiency_chance);

    double get_c_crops_fertilizer_efficiency_multiplier();
    void set_c_crops_fertilizer_efficiency_multiplier(double c_crops_fertilizer_efficiency_multiplier);

    double get_c_crops_exp_chance();
    void set_c_crops_exp_chance(double c_crops_exp_chance);

    int get_c_crops_exp_amount();
    void set_c_crops_exp_amount(int c_crops_exp_amount);

    double get_c_mobs_looting_multiplier();
    void set_c_mobs_looting_multiplier(double c_mobs_looting_multiplier);

    double get_c_mobs_exp_multiplier();
    void set_c_mobs_exp_multiplier(double c_mobs_exp_multiplier);

    int get_c_spawner_limit_bonus();
    void set_c_spawner_limit_bonus(int c_spawner_limit_bonus);

    int get_c_spawner_interval_reduction_amount();
    void set_c_spawner_interval_reduction_amount(int c_spawner_interval_reduction_amount);


    int get_protection_health();
    int get_protection_health_capacity();
    int get_protection_regen_amount();
    long get_protection_regen_interval();
    long get_protection_regen_damage_delay();
    int get_protection_range_amount();
    int get_protection_maximum_range_amount();
    int get_protection_generator_money_amount();
    int get_protection_generator_money_capacity();
    int get_protection_generator_slot_capacity();
    int get_protection_storage_slot_capacity();
    int get_protection_fuel();
    long get_protection_fuel_timer_total();
    int get_protection_fuel_capacity();
    long get_protection_generator_money_interval();
    long get_protection_generator_items_interval();
    long get_protection_fuel_consume_interval();
    long get_protection_decay_interval();
    int get_protection_damage_blast();
    int get_protection_damage_tool();
    int get_protection_damage_none();
    int get_protection_defense_amount();
    int get_protection_defense_capacity();
    int get_protection_defense_scaling_factor();


    Map<String, Map<String, Map<String, Map<Integer, ItemStack>>>> get_storage_items_map();
    void set_storage_items_map(Map<String, Map<String, Map<String, Map<Integer, ItemStack>>>> storage_items_map);
    void load();
    void update_storage_database();
    void storage_add_items(String gui_file_name, String group_id, String page_id, Map<Integer, ItemStack> objects);
    void storage_remove_item(String gui_file_name, String group_id, String page_id, int slot);
    Map<Integer, ItemStack> get_storage_items_deserialized(String group_id, int page_id);
    //List<DATA_Storage_item> deserialize_storage_items_data();
    //String serialize_storage_items_data(List<DATA_Storage_item> storage_items_data);


    Map<String, Integer> get_upgrades_map();
    void add_upgrades_map(String upgrade_path, int amount);
    void remove_upgrades_map(String upgrade_path, int amount);
    //void remove_upgrades_map(DATA_Upgrade upgrade_data, int amount);
    Integer get_upgrade_map_amount(String upgrade_path);
    void update_upgrades_database();


    Map<String, Integer> get_generator_stored_items_map();
    void clear_generator_stored_items_map();
    void add_generator_stored_items_map(String path, int amount);
    void remove_generator_stored_items_map(String path, int amount);
    Integer get_generator_stored_items_map_amount(String path);
    Integer get_generator_stored_items_map_amount_total();
    void update_generator_stored_items_database();


    String serialize_storage_map();
    Map<String, Map<String, Map<String, Map<Integer, ItemStack>>>> deserialize_storage_map(String serialized);
    String serialize_members_map();
    Map<String, String> deserialize_members_map(String serialized);
    String serialize_upgrades_map();
    Map<String, Integer> deserialize_upgrades_map(String serialized);
    String serialize_generator_stored_items_map();
    Map<String, Integer> deserialize_generator_stored_items_map(String serialized);
}