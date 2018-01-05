package com.example.examplemod.crops;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemCornSeed extends ItemSeeds {

    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("corn_seed");
        setRegistryName("corn_seed");
        setCreativeTab(ExampleMod.creativeTab);
    }

    public void registerItemModel(Item item) {
        ExampleMod.proxy.registerItemRenderer(item, 0, "corn_seed");
    }

}