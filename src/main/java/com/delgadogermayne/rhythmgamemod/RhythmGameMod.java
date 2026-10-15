package com.delgadogermayne.rhythmgamemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("rhythmgamemod")
public class RhythmGameMod {
    public static final String MOD_ID = "rhythmgamemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public RhythmGameMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register deferred registers
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        // Register event handlers
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("RhythmGameMod has been initialized!");
    }
}