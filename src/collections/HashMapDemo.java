package collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("john", 20);
        studentAges.put("mary", 19);
        studentAges.put("peter", 21);
        studentAges.put("sarah", 20);

        System.out.println("student ages: " + studentAges);
        System.out.println("total students: " + studentAges.size());

        System.out.println("john's age: " + studentAges.get("john"));
        System.out.println("tom's age: " + studentAges.get("tom"));

        if(studentAges.containsKey("mary")) {
            System.out.println("mary is in our class!");
        }
        if(studentAges.containsValue(20)) {
            System.out.println("someone is 20 years old!");
        }
        studentAges.put("john", 22); // john got older
        System.out.println("after john's birthday: " + studentAges);
        System.out.println("tom's age (with default): " + studentAges.getOrDefault("tom", 18));

        studentAges.remove("peter");
        System.out.println("after peter left: " + studentAges);
        System.out.println("all student names:");
        for(String name : studentAges.keySet()) {
            System.out.println("- " + name);
        }
        System.out.println("all ages:");
        for(Integer age : studentAges.values()) {
            System.out.println("- " + age);
        }
        System.out.println("name and age together:");
        for(String name : studentAges.keySet()) {
            System.out.println(name + " is " + studentAges.get(name) + " years old");
        }
        System.out.println("is map empty? " + studentAges.isEmpty());
        studentAges.clear();
        System.out.println("after clearing: " + studentAges);
        System.out.println("is empty now? " + studentAges.isEmpty());
    }
}