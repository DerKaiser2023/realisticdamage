package com.realisticdamage.realisticdamage.core;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DamageHandler {

    @SubscribeEvent
    public void onDamage(LivingHurtEvent event) {
        if (event.entityliving == null || event.source == null) return;

        float damage = event.ammount;
        String part = pickHitBodyPart(); // Placeholder logic

        switch (part) {
            case "head":
                damage *=3.0F;
                break;
            case "arm":
                // Disable item use logic here
                break;
            case "leg":
                // Slow movement logic here
                break;
        }

        event.ammount = damage;
    }

    private String pickHitBodyPart() {
        // Later replace with real raytrace/hitbox
        String[] parts = {"head", "torso", "arm", "leg"};
        return parts[(int)(Math.random() * parts.length)];
    }
}