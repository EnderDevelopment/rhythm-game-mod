package com.delgadogermayne.rhythmgamemod.registry;

import com.delgadogermayne.rhythmgamemod.RhythmGameMod;
import com.delgadogermayne.rhythmgamemod.items.StartButtonItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, RhythmGameMod.MOD_ID);
    
    public static final RegistryObject<Item> START_BUTTON = ITEMS.register(
        "start_button", 
        StartButtonItem::new
    );
}