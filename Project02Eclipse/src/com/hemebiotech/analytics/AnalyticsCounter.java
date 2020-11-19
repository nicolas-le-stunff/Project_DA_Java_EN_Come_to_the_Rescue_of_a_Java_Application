package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		if(args.length > 0  ){
			for (String value:args) {
				System.out.println("Ordonné par Symptoms ");
				new TreatmentSymptomsDataList(value);
			}
		}else{
			System.out.println("Aucun fichier trouvé, merci d'inserer en argument la liste des symptoms.");
		}
	}
}
