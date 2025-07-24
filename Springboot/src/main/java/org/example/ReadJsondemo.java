package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class ReadJsondemo {
    public static void main(String[] args) {
        try {
            InputStream is = ReadJsonExample.class.getClassLoader().getResourceAsStream("data.json");
            ObjectMapper mapper = new ObjectMapper();
            Person person = mapper.readValue(is, Person.class);
            System.out.println("Name: " + person.name);
            System.out.println("Age: " + person.age);
            System.out.println("City: " + person.city);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
