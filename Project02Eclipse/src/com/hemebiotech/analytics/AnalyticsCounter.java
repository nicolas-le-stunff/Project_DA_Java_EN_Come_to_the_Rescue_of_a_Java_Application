package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		TreatmentSymptomsDataList treatmentSymptomsDataList = new TreatmentSymptomsDataList("src/resources/symptoms.txt");


		System.out.println("Par symptoms et trié");
		System.out.println(treatmentSymptomsDataList.OrderedSymptomsByName());

	}


}
