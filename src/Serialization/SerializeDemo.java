package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Alice", 22);
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();

            System.out.println("Student object serialized to student.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
