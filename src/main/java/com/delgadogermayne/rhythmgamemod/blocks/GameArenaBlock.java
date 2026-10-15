package com.delgadogermayne.rhythmgamemod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.network.chat.Component;

public class GameArenaBlock extends Block {
    
    public GameArenaBlock() {
        super(BlockBehaviour.Properties
            .of(Material.STONE)
            .strength(3.0f, 3.0f)
            .requiresCorrectToolForDrops()
        );
    }
    
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, 
                                  Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("Game Arena activated!");
        }
        return InteractionResult.SUCCESS;
    }
}