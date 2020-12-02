package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

import java.util.List;
import java.util.Map;

public class WriteResult {

    public WriteResult() {
    }

    /**
     * Write the result in file.txt
     * @param entries List
     * @throws IOException
     */
    public void generateTxT(List<Map.Entry<String, Integer>> entries) throws IOException {
        FileWriter writer = new FileWriter("result.out");
        for( Map.Entry<String, Integer> entrie:entries) {
            writer.write(entrie + "\n");
        }
        writer.close();
    }
}
