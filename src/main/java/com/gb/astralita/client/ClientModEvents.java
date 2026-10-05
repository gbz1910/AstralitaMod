package com.gb.astralita.client;
import com.gb.astralita.AstralitaMod;import com.gb.astralita.registry.ModItems;import net.minecraftforge.api.distmarker.Dist;import net.minecraftforge.client.event.RegisterColorHandlersEvent;import net.minecraftforge.eventbus.api.SubscribeEvent;import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid=AstralitaMod.MODID,bus=Mod.EventBusSubscriber.Bus.MOD,value=Dist.CLIENT)
public class ClientModEvents{
@SubscribeEvent public static void colors(RegisterColorHandlersEvent.Item e){e.register((stack,tint)->0xD4143C,ModItems.ESPADA_ASTRALITA.get(),ModItems.PICARETA_ASTRALITA.get(),ModItems.MACHADO_ASTRALITA.get(),ModItems.PA_ASTRALITA.get(),ModItems.ENXADA_ASTRALITA.get(),ModItems.CAPACETE_ASTRALITA.get(),ModItems.PEITORAL_ASTRALITA.get(),ModItems.CALCAS_ASTRALITA.get(),ModItems.BOTAS_ASTRALITA.get());}}
