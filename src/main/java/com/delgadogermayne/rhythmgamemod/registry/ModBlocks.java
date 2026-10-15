package com.delgadogermayne.rhythmgamemod.registry;

import com.delgadogermayne.rhythmgamemod.RhythmGameMod;
import com.delgadogermayne.rhythmgamemod.blocks.GameArenaBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, RhythmGameMod.MOD_ID);
    
    public static final RegistryObject<Block> GAME_ARENA = BLOCKS.register(
        "game_arena", 
        GameArenaBlock::new
    );
}