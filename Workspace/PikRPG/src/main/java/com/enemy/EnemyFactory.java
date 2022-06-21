package com.enemy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.Item;
import com.item.ItemService;
import com.item.food.FoodFactory;
import com.item.treasure.TreasureFactory;
import com.position.Position;

/**
 * Where all enemies are stored.
 * All enemies drop Item.
 * @author darkm
 *
 */
@Service
public class EnemyFactory {
	private int totalEnemies;
	
	@Autowired
	ItemService itemServ;
	
	@Autowired
	FoodFactory foodFact;
	
	@Autowired
	TreasureFactory treasureFact;
	
	public int getTotalEnemies() {
		return totalEnemies;
	}
	
	private Enemy addEnemy(Position pos, String name, int hp, int damage, Size size, List<Item> drops) {
		totalEnemies++;
		return new Enemy(totalEnemies, name, pos, hp, damage, size, drops);
	}
	
	public Enemy smallEater(Position pos) {
		String name = "Small Eater";
		int hp = 3;
		int damage = 1;
		Size size = Size.SMALL;
		List<Item> drops = new ArrayList<Item>();
		drops.add(foodFact.smallEater());
		
		return addEnemy(pos, name, hp, damage, size, drops);
	}
	
	public Enemy largeEater(Position pos) {
		String name = "Large Eater";
		int hp = 30;
		int damage = 3;
		Size size = Size.LARGE;
		List<Item> drops = new ArrayList<Item>();
		drops.add(foodFact.largeEater());

		return addEnemy(pos, name, hp, damage, size, drops);
	}
	
	public Enemy massiveEater(Position pos) {
		String name = "Massive Eater";
		int hp = 50;
		int damage = 5;
		Size size = Size.MASSIVE;
		List<Item> drops = new ArrayList<Item>();
		drops.add(foodFact.massiveEater());
		drops.add(treasureFact.silverCoin());

		return addEnemy(pos, name, hp, damage, size, drops);
	}
	
	public Enemy smallWall(Position pos) {
		String name = "Small Wall";
		int hp = 20;
		int damage = 0;
		Size size = Size.LARGE;
		List<Item> drops = new ArrayList<Item>();

		return addEnemy(pos, name, hp, damage, size, drops);
	}
	
	public Enemy mediumWall(Position pos) {
		String name = "Medium Wall";
		int hp = 60;
		int damage = 0;
		Size size = Size.LARGE;
		List<Item> drops = new ArrayList<Item>();

		return addEnemy(pos, name, hp, damage, size, drops);
	}
	
	public Enemy hardWall(Position pos) {
		String name = "Hard Wall";
		int hp = 100;
		int damage = 0;
		Size size = Size.LARGE;
		List<Item> drops = new ArrayList<Item>();

		return addEnemy(pos, name, hp, damage, size, drops);
	}
	
}
