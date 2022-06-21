package com.soldier;

/**
 * The various states that a soldier can be in.<br>
 * STORED - When a soldier is stored in the base.<br>
 * IDLE - When a soldier is on the field, but not acting.<br>
 * ATTACK - When a soldier is attacking something.<br>
 * CARRY - When a soldier is carrying something.<br>
 * FOLLOW - When a soldier is following a Captain.
 * 
 * @author darkm
 *
 */
public enum SoldierState {
	STORED, IDLE, ATTACK, CARRY, FOLLOW;
}
