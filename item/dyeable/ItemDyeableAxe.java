package clashsoft.mods.moretools.item.dyeable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class ItemDyeableAxe extends ItemDyeableTool
{
	private static Block	blocksEffectiveAgainst[];
	
	public ItemDyeableAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, 3, par2EnumToolMaterial, blocksEffectiveAgainst);
	}
	
	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	{
		if (par2Block != null && par2Block.blockMaterial == Material.wood)
		{
			return efficiencyOnProperMaterial;
		}
		else
		{
			return super.getStrVsBlock(par1ItemStack, par2Block);
		}
	}
	
	static
	{
		blocksEffectiveAgainst = (new Block[] { Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.pumpkin, Block.pumpkinLantern });
	}
}