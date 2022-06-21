package com.soldier;

import org.springframework.stereotype.Service;

@Service
public class SoldierFactory {
	private int totalSoldiers = 0;
	private int maxSoldiers = 100;

	/**
	 * Handles creating a soldier at base with the appropriate status.
	 * @param soldierName
	 * @param soldierAtk
	 * @param soldierCarry
	 * @return
	 */
	private Soldier addSoldier(SoldierType type, int soldierAtk, int soldierCarry) {
		totalSoldiers++;
		if (totalSoldiers >= maxSoldiers) {
			return new Soldier(totalSoldiers, SoldierState.STORED, type, soldierAtk, soldierCarry);
		}
		return new Soldier(totalSoldiers, SoldierState.IDLE, type, soldierAtk, soldierCarry);
	}

	/**
	 * FACTORY METHODS<br>
	 * For each soldier type there is a factory method that handles
	 * their properties.
	 * 
	 * @return
	 */
	public Soldier makeFighter() {
		SoldierType type = SoldierType.FIGHTER;
		int soldierAtk = 3;
		int soldierCarry = 1;
		return addSoldier(type, soldierAtk, soldierCarry);
	}

	public Soldier makeWorker() {
		SoldierType type = SoldierType.WORKER;
		int soldierAtk = 1;
		int soldierCarry = 2;
		return addSoldier(type, soldierAtk, soldierCarry);
	}

}
