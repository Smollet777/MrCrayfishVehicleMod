package com.mrcrayfish.vehicle.item;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class ItemTrafficCone extends ItemBlock
{
    public ItemTrafficCone(Block block)
    {
        super(block);
    }

    @Override
    public EntityEquipmentSlot getEquipmentSlot(ItemStack stack)
    {
        return EntityEquipmentSlot.HEAD;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(GuiScreen.isShiftKeyDown())
        {
            String info = "Use this cone to block vehicles with it's extra collision height. It can also be used as a hat!";
            tooltip.addAll(Minecraft.getMinecraft().fontRenderer.listFormattedStringToWidth(info, 150));
        }
        else
        {
            tooltip.add(TextFormatting.YELLOW + "Hold SHIFT for Info");
        }
    }
}