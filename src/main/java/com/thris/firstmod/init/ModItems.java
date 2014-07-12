package com.thris.firstmod.init;


import com.thris.firstmod.item.ItemFirstMod;
import com.thris.firstmod.item.ItemStar;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemFirstMod star = new ItemStar();

    public static void init(){
        GameRegistry.registerItem(star, "star");
    }
}
