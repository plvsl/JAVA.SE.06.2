package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

public class UniversalClass {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> storage = new HashMap();
        Scanner scanner = new Scanner(System.in);

        Properties prop = new Properties();
        InputStream input;


        input = new FileInputStream(scanner.next());

        prop.load(input);

        for (String propertyKey : prop.stringPropertyNames()) {
            String value = prop.getProperty(propertyKey);
            storage.put(propertyKey, value);
        }

    }
}