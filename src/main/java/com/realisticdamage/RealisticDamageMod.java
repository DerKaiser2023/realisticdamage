package com.realisticdamage.realisticdamage;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.realisticdamage.realisticdamage.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "realisticdamage", name = "Realistic Damage & Blood System", version = "1.0")
public class RealisticDamageMod {
    @SidedProxy(clientSide = "com.realisticdamage.realisticdamage.proxy.ClientProxy", serverSide = "com.realisticdamage.realisticdamage.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static RealisticDamageMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.registerRenderes();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new com.realisticdamage.realisticdamage.core.DamageHandler());
    }
}