package com.stage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.GlobalData;

@Service
public class MapLoader {

	@Autowired
	MapFactory fact;

	@Autowired
	GlobalData data;

	/**
	 * Loads a map, initializes it if it has not been visited before.
	 * If it is already saved in GlobalData (visited once) then it is loaded
	 * from GlobalData instead. This allows maps to persist their data.
	 * @param id
	 * @return
	 */
	public Stage loadMapById(int id) {
		if (data.getMaps().containsKey(id)) {
			return data.getMaps().get(id);
		}
		return newStageById(id);
	}

	public Stage newStageById(int id) {
		switch (id) {
		case 1:
			return newStage(fact.createForest());
		}
		System.out.println("Invalid map ID!");
		return null;
	}

	public Stage newStage(Stage stage) {
		data.getMaps().put(stage.getId(), stage);
		return stage;
	}

}
