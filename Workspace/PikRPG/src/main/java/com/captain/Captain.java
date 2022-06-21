package com.captain;

import java.util.ArrayList;
import java.util.List;

import com.soldier.Soldier;

import lombok.Data;

@Data
public class Captain {
	int id;
	int unlockGold;
	List<Soldier> followers;
	
	protected Captain(int id, int unlockGold) {
		this.id = id;
		this.unlockGold = unlockGold;
		this.followers = new ArrayList<Soldier>();
	}
}
