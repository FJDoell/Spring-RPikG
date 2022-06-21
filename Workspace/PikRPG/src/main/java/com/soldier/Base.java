package com.soldier;

import lombok.Data;

@Data
public class Base {
	int storedSoldiers;
	SoldierType type;
	boolean owned = false;
	
	public Base(SoldierType type, boolean owned) {
		this.storedSoldiers = 3;
		this.type = type;
		this.owned = owned;
	}
	
}
