package momo.grounded_origins.item;

import momo.grounded_origins.GroundedOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item BEACH_CRAB_ICON = new Item(new FabricItemSettings());
    public static final Item DEER_ICON = new Item(new FabricItemSettings());
    public static final Item MOTH_ICON = new Item(new FabricItemSettings());
    public static final Item PENGUIN_ICON = new Item(new FabricItemSettings());

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(GroundedOrigins.MOD_ID, "beach_crab_icon"), BEACH_CRAB_ICON);
        Registry.register(Registry.ITEM, new Identifier(GroundedOrigins.MOD_ID, "deer_icon"), DEER_ICON);
        Registry.register(Registry.ITEM, new Identifier(GroundedOrigins.MOD_ID, "moth_icon"), MOTH_ICON);
        Registry.register(Registry.ITEM, new Identifier(GroundedOrigins.MOD_ID, "beach_crab_icon"), PENGUIN_ICON);
    }

}
