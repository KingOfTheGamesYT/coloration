package net.coloration.mod;

import net.minecraft.block.Block;
import net.minecraft.item.*;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColorationMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ColorationMod.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final RegistryObject<Block> AMBER = BLOCKS.register("amber", BlockColorBlock::new);
    public static final RegistryObject<Item> AMBER_ITEM = ITEMS.register("amber", () -> new BlockItemBase(AMBER.get()));
    public static final RegistryObject<Block> APRICOT = BLOCKS.register("apricot", BlockColorBlock::new);
    public static final RegistryObject<Item> APRICOT_ITEM = ITEMS.register("apricot", () -> new BlockItemBase(APRICOT.get()));
    public static final RegistryObject<Block> AQUAMARINE = BLOCKS.register("aquamarine", BlockColorBlock::new);
    public static final RegistryObject<Item> AQUAMARINE _ITEM = ITEMS.register("aquamarine", () -> new BlockItemBase(AQUAMARINE.get()));
    public static final RegistryObject<Block> ARCTIC = BLOCKS.register("arctic", BlockColorBlock::new);
    public static final RegistryObject<Item> ARCTIC_ITEM = ITEMS.register("arctic", () -> new BlockItemBase(ARCTIC.get()));
    public static final RegistryObject<Block> AZURE = BLOCKS.register("azure", BlockColorBlock::new);
    public static final RegistryObject<Item> AZURE_ITEM = ITEMS.register("azure", () -> new BlockItemBase(AZURE.get()));
    public static final RegistryObject<Block> BASIL = BLOCKS.register("basil", BlockColorBlock::new);
    public static final RegistryObject<Item> BASIL_ITEM = ITEMS.register("basil", () -> new BlockItemBase(BASIL.get()));
    public static final RegistryObject<Block> BLONDE = BLOCKS.register("blonde", BlockColorBlock::new);
    public static final RegistryObject<Item> BLONDE_ITEM = ITEMS.register("blonde", () -> new BlockItemBase(BLONDE.get()));
    public static final RegistryObject<Block> BLOOD = BLOCKS.register("blood", BlockColorBlock::new);
    public static final RegistryObject<Item> BLOOD_ITEM = ITEMS.register("blood", () -> new BlockItemBase(BLOOD.get()));

}