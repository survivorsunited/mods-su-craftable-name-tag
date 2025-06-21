package org.survivorsunited.mods.craftablenametag;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main mod class for SU Craftable Name Tag
 * This mod adds the ability to craft name tags using a crafting table
 */
public class SUCraftableNameTag implements ModInitializer {
	public static final String MOD_ID = "su-craftable-name-tag";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("SU Craftable Name Tag Mod initialized!");
		LOGGER.info("Name tags can now be crafted using string, paper, and iron ingots in a crafting table.");
	}
}