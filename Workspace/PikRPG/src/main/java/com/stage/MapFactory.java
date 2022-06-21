package com.stage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.GlobalData;
import com.stage.space.Space;
import com.stage.space.SpaceBuilder;

@Service
public class MapFactory {

	@Autowired
	GlobalData globalDat;

	public Stage addFirstSpace(Stage map) {
		if (map.getType().equals(MapType.CAVE)) {
			map.getSpaces().put(0, new SpaceBuilder()
					.withCaptains(globalDat.getCaptains())
					.build());
		}
		if (map.getType().equals(MapType.SURFACE)) {
			map.getSpaces().put(0, new SpaceBuilder()
					.withBases(globalDat.getBases())
					.withCaptains(globalDat.getCaptains())
					.build());
		}
		return map;
	}

	public Stage randomizeMap(Stage map) {
		LinkedList<Integer> keys = new LinkedList<Integer>();
		for (Integer i : map.getSpaces().keySet()) {
			keys.add(i);
		}
		Collections.shuffle(keys);

		LinkedList<Space> values = new LinkedList<Space>();
		for (Space s : map.getSpaces().values()) {
			values.add(s);
		}
		Collections.shuffle(values);

		LinkedHashMap<Integer, Space> shuffledMap = new LinkedHashMap<Integer, Space>();
		for (int i = 0; i < keys.size(); i++) {
			shuffledMap.put(keys.get(i), values.get(i));
		}

		map.setSpaces(shuffledMap);
		return map;
	}

	public Stage createForest() {
		int unlockGold = 0;
		MapType type = MapType.SURFACE;
		boolean randomize = false;

		Stage newMap = new Stage(1, unlockGold, type, new LinkedHashMap<Integer, Space>());

		addFirstSpace(newMap);
		if (randomize)
			randomizeMap(newMap);

		return newMap;
	}
}
