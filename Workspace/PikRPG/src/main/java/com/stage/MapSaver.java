package com.stage;

import org.springframework.beans.factory.annotation.Autowired;

import com.global.GlobalData;
import com.soldier.Base;
import com.soldier.Soldier;
import com.stage.space.Space;

public class MapSaver {

	@Autowired
	MapFactory fact;

	@Autowired
	GlobalData data;

	public Stage saveMap(Stage st) {
		
		for(Space sp : st.getSpaces().values()) {
			if(!sp.getBases().isEmpty()) {
				for(Base b : sp.getBases().values()) {
					if(b.isOwned()) {
						data.getBases().put(b.getType(), b);
						b = null;
					}
				}
			}
			
			for(Soldier sol : sp.getAllSoldiers()) {
				switch(sol.getState()) {
				case ATTACK:
					sol = null;
					break;
				case CARRY:
					sol = null;
					break;
				case FOLLOW:
					break;
				case IDLE:
					break;
				case STORED:
					break;
				default:
					break;
				}
			}
		}return st;
}

}
