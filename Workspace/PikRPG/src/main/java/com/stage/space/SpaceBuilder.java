package com.stage.space;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.captain.Captain;
import com.enemy.Enemy;
import com.entrance.Entrance;
import com.item.Item;
import com.soldier.Base;
import com.soldier.Soldier;
import com.soldier.SoldierType;

@Service
public class SpaceBuilder {
	HashMap<SoldierType, Base> bases = new HashMap<SoldierType, Base>();
	List<Soldier> soldiers = new ArrayList<Soldier>();
	List<Enemy> enemies = new ArrayList<Enemy>();
	List<Item> items = new ArrayList<Item>();
	List<Captain> captains = new ArrayList<Captain>();
	Entrance entrance = new Entrance();
	
	public SpaceBuilder withBases(HashMap<SoldierType, Base> bases) {
		this.bases = bases;
		return this;
	}
	
	public SpaceBuilder withSoldiers(List<Soldier> soldiers) {
		this.soldiers = soldiers;
		return this;
	}
	
	public SpaceBuilder withEnemies(List<Enemy> enemies) {
		this.enemies = enemies;
		return this;
	}
	
	public SpaceBuilder withItems(List<Item> items) {
		this.items = items;
		return this;
	}
	
	public SpaceBuilder withCaptains(List<Captain> captains) {
		this.captains = captains;
		return this;
	}
	
	public SpaceBuilder withEntrance(Entrance e) {
		this.entrance = e;
		return this;
	}
	
	public Space build() {
		return new Space(this.bases, this.soldiers, this.enemies, this.items, this.captains, this.entrance);
	}
	
}
