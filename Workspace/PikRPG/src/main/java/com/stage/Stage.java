package com.stage;

import java.util.LinkedHashMap;

import com.stage.space.Space;

import lombok.Data;

/**
 * A map is simply a list of spaces.
 * 0 is the base.
 * @author darkm
 *
 */
@Data
public class Stage {
	int id;
	int unlockGold;
	MapType type;
	LinkedHashMap<Integer, Space> spaces;
	
	protected Stage(int id, int unlockGold, MapType type, LinkedHashMap<Integer, Space> spaces) {
		super();
		this.id = id;
		this.unlockGold = unlockGold;
		this.type = type;
		this.spaces = spaces;
	}
	
}
