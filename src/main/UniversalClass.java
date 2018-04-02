package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class UniversalClass {
    static HashMap storage = new HashMap<String, String>();

    public static void importProperties() throws IOException {
        Properties prop = new Properties();
        InputStream input;

        input = new FileInputStream("src/resources/prop.properties");

        prop.load(input);

        for (String propertyKey : prop.stringPropertyNames()) {
            String value = prop.getProperty(propertyKey);
            storage.put(propertyKey, value);
        }
    }

    private static String getValueByKey(String key) throws IOException {
        if (storage.isEmpty()) {
            importProperties();
            return storage.get(key).toString();
        } else {
            return storage.get(key).toString();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getValueByKey("1"));
        System.out.println(getValueByKey("2"));
        System.out.println(getValueByKey("2"));
        System.out.println(getValueByKey("3"));
    }
}