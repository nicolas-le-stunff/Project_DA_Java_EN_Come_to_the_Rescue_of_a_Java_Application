package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Extract data from file
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String filepath;
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(String.valueOf(filepath)));
				String line = reader.readLine();
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
