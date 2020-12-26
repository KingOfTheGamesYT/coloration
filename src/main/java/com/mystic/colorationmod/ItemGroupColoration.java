package com.mystic.colorationmod;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ItemGroupColoration
{
    public static final ItemGroup COLORATION = FabricItemGroupBuilder.create(
            new Identifier("coloration", "coloration"))
            .icon(() -> new ItemStack(Items.BLUE_DYE))
            .build();
}
