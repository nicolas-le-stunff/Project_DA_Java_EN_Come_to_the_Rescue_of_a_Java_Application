package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

public class TreatmentSymptomsDataList  {

    private final List<String> listSymptoms;
    private HashMap<String,Integer> arrayByKeyValue;

    /**
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public TreatmentSymptomsDataList(String filepath) throws IOException {

        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(filepath);
        this.listSymptoms = readSymptomDataFromFile.GetSymptoms();
        countBySymptoms();
        WriteResult write = new WriteResult();
        write.GenerateTxT(OrderedSymptomsByName());
        System.out.println(OrderedSymptomsByName());
    }

        /**
         *
         * @return a list with key: Symptoms / Values: number of symptoms
         */
    public List<Map.Entry<String, Integer>> GetBySymptoms(){
        return formatToArrayList(arrayByKeyValue);
    }

    /**
     *
     * @return a list with key: Symptoms / Values: number of symptoms orderder by names
     */
    private List<Map.Entry<String, Integer>> OrderedSymptomsByName(){
      Map<String,Integer> map = new TreeMap<>(arrayByKeyValue);
        return formatToArrayList(map);
    }

    /**
     * initialise the arrayByKeyValue with key:Symptoms / value : number of symptoms
     */
    private void countBySymptoms(){
        HashMap<String,Integer> hashSymptoms = new HashMap<>();
        for (String symptom:this.listSymptoms)
        {
            if(hashSymptoms.containsKey(symptom)){
                hashSymptoms.put(symptom,hashSymptoms.get(symptom)+1);
            }else{
                hashSymptoms.put(symptom,1);
            }
        }
        this.arrayByKeyValue = hashSymptoms;
    }

    /**
     * @param mapKeyValue map with key value
     * @return an arrayList
     */
    private ArrayList<Map.Entry<String, Integer>> formatToArrayList(Map<String, Integer> mapKeyValue){
        Set<Map.Entry<String, Integer>> EntrySet = mapKeyValue.entrySet();
        return new ArrayList<>(EntrySet);
    }



}
