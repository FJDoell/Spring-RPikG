package com.item;

import java.util.ArrayList;
import java.util.List;

import com.position.Position;
import com.soldier.Soldier;

import lombok.Data;

@Data
public abstract class Item {
	int id;
	String name;
	Position pos;
	int weight;
	int value;
	List<Soldier> carriers;
	
	public Item(int id, String name, int weight, int value) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.carriers = new ArrayList<Soldier>();
	}
	
}
