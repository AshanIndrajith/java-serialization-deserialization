package Deserialize;

import serialize.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {

          Student.setAge(12);
          

        try {
            FileInputStream fis=new FileInputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\stu.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student stu=(Student) ois.readObject();

            System.out.println("id :"+stu.getId());
            System.out.println("name :"+stu.getName());
            System.out.println("Age :"+Student.getAge());
            System.out.println("password :"+stu.getPassword());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
