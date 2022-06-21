package com.global;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Saves a stringified JSON as save data in a text file. Can also load data, or get all save file names.
 * 
 * @author darkm
 *
 */
@Service
public class SaveDataManager {
	GlobalData currentSave = new GlobalData();
	String mainSavePath = "../saves/";
	
	private PrintWriter getWriter(String fileName) throws IOException {
		String filePath = mainSavePath + fileName + ".txt";
		FileWriter fileWriter = new FileWriter(filePath, false);
		PrintWriter writer = new PrintWriter(fileWriter);
		return writer;
	}
	
	private BufferedReader getReader(String fileName) throws FileNotFoundException {
		BufferedReader in = new BufferedReader(new FileReader(mainSavePath + fileName + ".txt"));
		return in;
	}
	
	public LinkedHashSet<String> getAllSaveNames() {
		String[] fileNames = new File(mainSavePath).list();
		LinkedHashSet<String> allSaveNames = new LinkedHashSet<String>();
		for(String s : fileNames) {
			allSaveNames.add(s.split("\\.")[0]);
		}
		return allSaveNames;
	}

	public void newSave(String fileName) throws IOException {
		PrintWriter writer = getWriter(fileName);
		ObjectMapper mapper = new ObjectMapper();
		writer.write(mapper.writeValueAsString(new GlobalData()));
		writer.close();
	}

	public void saveFile(String fileName) throws IOException {
		PrintWriter writer = getWriter(fileName);
		ObjectMapper mapper = new ObjectMapper();
		writer.write(mapper.writeValueAsString(currentSave));
		writer.close();
	}
	
	public GlobalData loadFile(String fileName) throws IOException {
		try {
			BufferedReader in = getReader(fileName);
			ObjectMapper mapper = new ObjectMapper();
			currentSave = mapper.readValue(in.readLine(), GlobalData.class);
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: No save found to load with name " + fileName + "!");
			currentSave = new GlobalData();
		}
		return currentSave;
	}
	
	public boolean deleteFile(String fileName) {
		File fileToDelete = new File(mainSavePath + fileName + ".txt");
		if(fileToDelete.delete()) {
			System.out.println(fileName + " successfully deleted!");
		} else {
			System.out.println(fileName + " save does not exist.");
		}
		return false;
	}
}
