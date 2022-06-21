package com.stage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.GlobalData;

/**
 * Only one map is loaded at a time.
 * @author darkm
 *
 */
@Service
public class MapService {
	
	@Autowired
	GlobalData data;
	
	
	
}