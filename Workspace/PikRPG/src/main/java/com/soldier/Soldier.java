package com.soldier;

import com.position.Position;
import com.position.Side;

import lombok.Data;

/**
 * Model for a soldier. Each soldier can carry treasure, and deal damage to something.
 * So they store these values.
 * 
 * @author darkm
 *
 */
@Data
public class Soldier {
	int id = 0;
	// position 0 is the base.
	Position pos = new Position();
	SoldierState state;
	SoldierType type;
	int attack = 1;
	int carryPow = 1;
	
	// All args
	protected Soldier(int id, SoldierState state, SoldierType type, int attack, int carryPow) {
		super();
		this.id = id;
		this.pos = new Position(0, Side.LEFT);
		this.state = state;
		this.type = type;
		this.attack = attack;
		this.carryPow = carryPow;
	}
	
}
