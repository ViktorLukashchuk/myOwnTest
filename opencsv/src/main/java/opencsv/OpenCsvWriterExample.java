package opencsv;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCsvWriterExample {

    public static void main(String[] args) throws IOException {
    	String[] books = {"Blur", "Shining", "Harry Potter", "Christine", "Doctor Sleep", "Afterlife", "Samson"};
        List<String[]> list = new ArrayList<>();
        list.add(books);

        try (CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Viktor\\eclipse-workspace\\opencsv\\src\\test.csv"))) {
            writer.writeAll(list);
            System.out.println("Write process is successful");
            
        }

    }

 }