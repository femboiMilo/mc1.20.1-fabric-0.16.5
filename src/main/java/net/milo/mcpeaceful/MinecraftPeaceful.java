package net.milo.mcpeaceful;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftPeaceful implements ModInitializer {
	public static final String MOD_ID = "minecraft-peaceful";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world! // MC 'Peaceful' running version Pre-alpha 0.1");
	}
}