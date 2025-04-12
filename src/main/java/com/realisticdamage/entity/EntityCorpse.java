package com.realisticdamage.realisticdamage.entity

import net.minecraft.entity.item.EntityItem;
import net.minecraft.world.World;

public class EntityCorpse extends EntityItem {
    public EntityCorpse(World world) {
        super(world);
    }

    public EntityCorpse(World world, double x, double y, double z) {
        super(world, x, y, z, null);
        // Custom model/texture later it prob take like
        // 3 billion years to implement
    }

    // Overide drop behavior, interaction, etc.
}