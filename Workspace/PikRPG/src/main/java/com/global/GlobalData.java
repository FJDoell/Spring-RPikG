package com.global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.captain.Captain;
import com.soldier.Base;
import com.soldier.SoldierType;
import com.stage.Stage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * This is what is stored in a save file.
 * @author darkm
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class GlobalData {
	HashMap<SoldierType, Base> bases = new HashMap<SoldierType, Base>();
	List<Captain> captains = new ArrayList<Captain>();
	HashMap<Integer, Stage> maps = new HashMap<Integer, Stage>();
	int money = 0;
	int dayCount = 0;
}
