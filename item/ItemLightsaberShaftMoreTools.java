package clashsoft.mods.moretools.item;

import clashsoft.mods.moretools.MTMTools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLightsaberShaftMoreTools extends ItemMoreTools
{
	
	public ItemLightsaberShaftMoreTools(int par1)
	{
		super(par1, CreativeTabs.tabRedstone);
		this.maxStackSize = 1;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		ItemStack blue = new ItemStack(MTMTools.lightsaberBlue, 1);
		// par3EntityPlayer.triggerAchievement(MoreToolsMod_Achievements.lightsaber);
		return blue;
	}
	
	/**
	 * CLASHSOFT: This code makes items use their unlocalized name as icon name
	 */
	@Override
	public Item setUnlocalizedName(String name)
	{
		super.setUnlocalizedName(name);
		super.setTextureName(name);
		return this;
	}
}
