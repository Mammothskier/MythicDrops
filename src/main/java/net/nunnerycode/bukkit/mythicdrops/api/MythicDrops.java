package net.nunnerycode.bukkit.mythicdrops.api;

import net.nunnerycode.bukkit.libraries.ivory.config.VersionedIvoryYamlConfiguration;
import net.nunnerycode.bukkit.mythicdrops.api.settings.ConfigSettings;
import net.nunnerycode.bukkit.mythicdrops.api.settings.CreatureSpawningSettings;
import net.nunnerycode.bukkit.mythicdrops.api.settings.IdentifyingSettings;
import net.nunnerycode.bukkit.mythicdrops.api.settings.RepairingSettings;
import net.nunnerycode.bukkit.mythicdrops.api.settings.SockettingSettings;
import net.nunnerycode.bukkit.mythicdrops.hooks.SplatterWrapper;

import se.ranzdo.bukkit.methodcommand.CommandHandler;

import java.util.logging.Level;

public interface MythicDrops {

  VersionedIvoryYamlConfiguration getCreatureSpawningYAML();

  void debug(Level level, String... messages);

  ConfigSettings getConfigSettings();

  CreatureSpawningSettings getCreatureSpawningSettings();

  RepairingSettings getRepairingSettings();

  SockettingSettings getSockettingSettings();

  IdentifyingSettings getIdentifyingSettings();

  VersionedIvoryYamlConfiguration getConfigYAML();

  VersionedIvoryYamlConfiguration getCustomItemYAML();

  VersionedIvoryYamlConfiguration getItemGroupYAML();

  VersionedIvoryYamlConfiguration getLanguageYAML();

  VersionedIvoryYamlConfiguration getTierYAML();

  VersionedIvoryYamlConfiguration getSocketGemsYAML();

  VersionedIvoryYamlConfiguration getSockettingYAML();

  VersionedIvoryYamlConfiguration getRepairingYAML();

  VersionedIvoryYamlConfiguration getIdentifyingYAML();

  void reloadSettings();

  void reloadTiers();

  void reloadCustomItems();

  void reloadNames();

  CommandHandler getCommandHandler();

  SplatterWrapper getSplatterWrapper();

}
