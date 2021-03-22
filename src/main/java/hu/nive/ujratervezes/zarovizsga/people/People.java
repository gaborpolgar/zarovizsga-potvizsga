package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {


    private static final String MALE = "Male";

    public int getNumberOfMales(String path){
        try(BufferedReader reader = Files.newBufferedReader(Path.of(path))){
            return countMales(reader);
        } catch (IOException ioe) {
           throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    private int countMales(BufferedReader reader) throws IOException {
        String line;
        int count = 0;
        reader.readLine();
        while ((line = reader.readLine()) != null){
            String[] parts = line.split(",");
            if (parts[4].equals(MALE)){
                count++;
            }
        }
        return count;
    }
}
