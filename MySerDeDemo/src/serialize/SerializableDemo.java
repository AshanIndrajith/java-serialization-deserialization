package serialize;

import java.io.*;

public class SerializableDemo {

    public static void main(String[] args) {

        Student stu=new Student(1,"ashan");
        Student.setAge(24);
        stu.setPassword(23l);


        try {
            FileOutputStream fos=new FileOutputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\stu.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.flush();
            oos.close();
            fos.close();

            System.out.println("Serialization Complete");

        } catch (FileNotFoundException e) {
            System.out.println("Exception Occured : " + e.getMessage());
            throw new RuntimeException(e);

        } catch (IOException e) {
            System.out.println("Exception displayed : " + e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
