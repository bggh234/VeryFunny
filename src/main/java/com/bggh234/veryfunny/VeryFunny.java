package com.bggh234.veryfunny;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(value = VeryFunny.MOD_ID)
public class VeryFunny {
    public static final String MOD_ID = "veryfunny";
    public static final Logger LOGGER = LogUtils.getLogger();

    public VeryFunny() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(FMLCommonSetupEvent event) {
        LOGGER.info("Welcome to VerryFunny Mod. Have Fun!");
    }
}
