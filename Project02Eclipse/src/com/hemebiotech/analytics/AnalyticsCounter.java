package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		if(args.length > 0  ){
			for (String value:args) {
				System.out.println("Ordonné par Symptoms ");
				new TreatmentSymptomsDataList(value);
			}
		}
	}
}
