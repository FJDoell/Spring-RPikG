package com.position;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Handles coordinates and what side something is on (right or left)
 * Side matters when something is LARGE, as it blocks passage from the opposing side.
 * @author darkm
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
	int coordinates;
	Side side;
	
	public void moveLeft() {
		coordinates--;
		side = Side.RIGHT;
	}
	
	public void moveRight() {
		coordinates++;
		side = Side.LEFT;
	}
	
}
