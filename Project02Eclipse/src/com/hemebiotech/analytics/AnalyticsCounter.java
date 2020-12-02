package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		InputStream is = AnalyticsCounter.class.getResourceAsStream("/resources/symptoms.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		TreatmentSymptomsDataList treatmentSymptomsDataList = new TreatmentSymptomsDataList(reader);


		System.out.println("Par symptoms et trié");
		System.out.println(treatmentSymptomsDataList.orderedSymptomsByName());

	}


}
