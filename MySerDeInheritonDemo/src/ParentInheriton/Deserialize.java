package ParentInheriton;

import java.io.*;

public class Deserialize {

    public void Deserializeee() throws IOException, ClassNotFoundException {

        FileInputStream fio=new FileInputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\file.txt");
        ObjectInputStream ois=new ObjectInputStream(fio);
        Cat cc=(Cat)ois.readObject();
        System.out.println(cc.toString());



    }
}
