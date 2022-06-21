package com.enemy;

import java.util.List;

import com.item.Item;
import com.position.Position;

import lombok.Data;

@Data
public class Enemy {
	int id;
	String name;
	Position pos;
	int hp;
	int maxHp;
	int damage;
	Size size;
	List<Item> drops;
	
	protected Enemy(int id, String name, Position pos, int hp, int damage, Size size, List<Item> drops) {
		super();
		this.id = id;
		this.name = name;
		this.pos = pos;
		this.hp = hp;
		this.maxHp = hp;
		this.damage = damage;
		this.size = size;
		this.drops = drops;
	}
	
}
