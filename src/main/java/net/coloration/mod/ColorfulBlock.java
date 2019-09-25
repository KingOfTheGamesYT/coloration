package net.coloration.mod;

import java.util.Collections;
import java.util.List;

import net.fabricmc.fabric.api.loot.v1.FabricLootSupplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.loot.LootPool;
import net.minecraft.world.loot.LootSupplier;
import net.minecraft.world.loot.LootTables;
import net.minecraft.world.loot.context.LootContext;
import net.minecraft.world.loot.context.LootContextParameters;
import net.minecraft.world.loot.context.LootContextTypes;

public class ColorfulBlock extends Block {
 public ColorfulBlock(Block.Settings settings) {
     super(settings);
     




 }
 
 
    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        // EARLY DETECTION OF BUSTED LOOT TABLES:
        Identifier tableId = this.getDropTableId();
        System.out.println("Loot table ID is: " + tableId);

        if (tableId == LootTables.EMPTY) {
            return Collections.emptyList();
        } else {
            LootContext context = builder.put(LootContextParameters.BLOCK_STATE, state).build(LootContextTypes.BLOCK);
            ServerWorld world = context.getWorld();
            LootSupplier lootSupplier = world.getServer().getLootManager().getSupplier(tableId);

            List<ItemStack> result = lootSupplier.getDrops(context);
            if (result.isEmpty()) {
                // This might not be good. Confirm:

                if (lootSupplier instanceof FabricLootSupplier) {
                    List<LootPool> pools = ((FabricLootSupplier) lootSupplier).getPools();
                    if (pools.isEmpty()) {
                        System.out.println("The loot pool json really is bad somehow!");
                    }
                }
            }
            return result;
        }
    }

}