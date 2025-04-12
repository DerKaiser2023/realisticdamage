package com.realisticdamage.realisticdamage.explosions;

import net.minecraft.world.World;
import net.minecraft.util.Vec3;

public class ExplosionHandler {
    
    public static void createRealisticExplosion(World world, double x, double y, double z, float strength) {
        // TODO: Add shrapnel particles, limb damage, directional force, etc.
        world.createExplosion(null, x, y, z, strength, true);
    }
}