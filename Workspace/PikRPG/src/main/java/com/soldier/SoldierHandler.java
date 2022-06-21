package com.soldier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoldierHandler {
	
	public Soldier moveLeft(Soldier s) {
		s.getPos().moveLeft();
		return s;
	}
	
	public List<Soldier> moveLeft(List<Soldier> soldiers) {
		for(Soldier s : soldiers) {
			moveLeft(s);
		}
		return soldiers;
	}
	
	public Soldier moveRight(Soldier s) {
		s.getPos().moveRight();
		return s;
	}
	
	public List<Soldier> moveRight(List<Soldier> soldiers) {
		for(Soldier s : soldiers) {
			moveRight(s);
		}
		return soldiers;
	}
	
	public List<Soldier> getSoldiersByPosition(List<Soldier> soldiers, int position) {
		List<Soldier> returned = new ArrayList<Soldier>();
		for(Soldier s : soldiers)
			if(s.getPos().getCoordinates() == position) {
				returned.add(s);
			}
		return returned;
	}
	
	public List<Soldier> getSoldiersByState(List<Soldier> soldiers, SoldierState state) {
		List<Soldier> returned = new ArrayList<Soldier>();
		for(Soldier s : soldiers)
			if(s.getState().equals(state)) {
				returned.add(s);
			}
		return returned;
	}
	
	public List<Soldier> getSoldiersByType(List<Soldier> soldiers, SoldierType type) {
		List<Soldier> returned = new ArrayList<Soldier>();
		for(Soldier s : soldiers)
			if(s.getType().equals(type)) {
				returned.add(s);
			}
		return returned;
	}
	
	public SoldierType findHighestSoldierType(List<Soldier> soldiers) {
		int frequency = 0;
		int highestSoldiers = 0;
		List<SoldierType> enumList = new ArrayList<SoldierType>();
		SoldierType highestSoldierType = SoldierType.NONE;
		
		for(Soldier s : soldiers) {
			enumList.add(s.getType());
		}
		
		for(SoldierType type : SoldierType.values()) {
			frequency = Collections.frequency(enumList, type);
			if(highestSoldiers < frequency) {
				highestSoldiers = frequency;
				highestSoldierType = type;
			}
		}
		
		return highestSoldierType;
	}

}
