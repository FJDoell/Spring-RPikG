package com.item.food;

import org.springframework.stereotype.Service;

@Service
public class FoodFactory {
	int totalFoods = 0;
	
	private Food makeFood(String name, int weight, int value) {
		totalFoods++;
		return new Food(totalFoods, name, weight, value);
	}
	
	public Food berry() {
		String name = "Berry";
		int weight = 1;
		int value = 1;
		return makeFood(name, weight, value);
	}
	
	public Food smallEater() {
		String name = "Small Eater";
		int weight = 2;
		int value = 2;
		return makeFood(name, weight, value);
	}
	
	public Food largeEater() {
		String name = "Large Eater";
		int weight = 30;
		int value = 15;
		return makeFood(name, weight, value);
	}
	
	public Food massiveEater() {
		String name = "Massive Eater";
		int weight = 50;
		int value = 25;
		return makeFood(name, weight, value);
	}

}
