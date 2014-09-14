package com.algone.dynamicon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Utils {


    public static List<ConnectedPair> list(String fileName) {
        assert fileName != null;

        List<ConnectedPair> pairs = new ArrayList<ConnectedPair>();


        File file = new File(fileName);

        try {

            FileReader fileReader = new FileReader(file);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();

            while (line != null) {
                if (line.length() > 3) {
                    throw new IllegalArgumentException("This should never happen !");
                }
                pairs.add(new ConnectedPair(Character.getNumericValue(line.charAt(0)), Character.getNumericValue(line.charAt(2))));
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("The provided file name" + fileName + " does not exist !");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pairs;
    }
}
