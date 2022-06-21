package com.item.treasure;

import org.springframework.stereotype.Service;

@Service
public class TreasureFactory {
	int totalTreasures = 0;

	private Treasure makeTreasure(String name, int weight, int value) {
		totalTreasures++;
		return new Treasure(totalTreasures, name, weight, value);
	}

	public Treasure bronzeCoin() {
		String name = "Bronze Coin";
		int weight = 10;
		int value = 5;
		return makeTreasure(name, weight, value);
	}
	
	public Treasure goldCoin() {
		String name = "Gold Coin";
		int weight = 20;
		int value = 100;
		return makeTreasure(name, weight, value);
	}
	
	public Treasure silverCoin() {
		String name = "Silver Coin";
		int weight = 25;
		int value = 20;
		return makeTreasure(name, weight, value);
	}

}
