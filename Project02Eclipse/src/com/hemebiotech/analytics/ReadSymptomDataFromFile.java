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

	//private final String filepath;
	BufferedReader reader;

	/**
	 *
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile(BufferedReader reader) {
		this.reader = reader;
	}

	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		//if (filepath != null) {
		try {
			//BufferedReader reader = new BufferedReader (new FileReader(filepath));
			String line = reader.readLine();

			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//}
		return result;
	}

}