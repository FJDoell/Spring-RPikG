package com.item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.treasure.Treasure;
import com.soldier.Soldier;
import com.soldier.SoldierHandler;
import com.soldier.SoldierType;

@Service
public class ItemService {

	@Autowired
	SoldierHandler soldierServ;

	/**
	 * Add given items to something. Whether it's a space or an enemy.
	 * 
	 * @param items
	 * @return
	 */
	public List<Item> addItems(Item... items) {
		List<Item> myItems = new ArrayList<Item>();
		for (Item i : items) {
			myItems.add(i);
		}
		return myItems;
	}

	public SoldierType findHighestSoldierType(Item i) {
		List<Soldier> itemSoldiers = i.getCarriers();
		return soldierServ.findHighestSoldierType(itemSoldiers);
	}

	/**
	 * Checks if the given item is a Treasure or an item.
	 * @param i
	 * @return
	 */
	public boolean isTreasure(Item i) {
		if (Treasure.class.isAssignableFrom(i.getClass())) {
			System.out.println("This is a treasure");
			return true;
		}
		System.out.println("This is a food");
		return false;
	}

}
