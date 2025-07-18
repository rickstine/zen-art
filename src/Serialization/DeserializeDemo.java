package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student s1 = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Student name: " + s1.name);
            System.out.println("Student age: " + s1.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

