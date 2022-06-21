package com.stage.space;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.captain.Captain;
import com.enemy.Enemy;
import com.entrance.Entrance;
import com.item.Item;
import com.soldier.Base;
import com.soldier.Soldier;
import com.soldier.SoldierType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Space {
	HashMap<SoldierType, Base> bases = new HashMap<SoldierType, Base>();
	List<Soldier> soldiers = new ArrayList<Soldier>();
	List<Enemy> enemies = new ArrayList<Enemy>();
	List<Item> items = new ArrayList<Item>();
	List<Captain> captains = new ArrayList<Captain>();
	Entrance entrance = new Entrance();
	
	public List<Soldier> getAllSoldiers() {
		List<Soldier> allSoldiers = new ArrayList<Soldier>();
		allSoldiers.addAll(this.soldiers);
		for(Item i : items)
			allSoldiers.addAll(i.getCarriers());
		for(Captain c : captains)
			allSoldiers.addAll(c.getFollowers());
		return allSoldiers;
	}
	
}
