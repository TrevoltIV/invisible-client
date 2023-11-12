package net.trevolt.invisibleclient;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvisibleClient implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("invisibleclient");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}