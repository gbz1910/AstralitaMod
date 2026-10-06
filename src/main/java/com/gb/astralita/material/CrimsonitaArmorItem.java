package com.gb.astralita.material;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.DyeableArmorItem;
import net.minecraft.world.item.ItemStack;
public class CrimsonitaArmorItem extends DyeableArmorItem{
 public CrimsonitaArmorItem(ArmorMaterial material, ArmorItem.Type type, Properties properties){super(material,type,properties);}
 @Override public int getColor(ItemStack stack){return 0xD4143C;}
}