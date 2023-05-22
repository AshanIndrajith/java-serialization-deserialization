package SubClassInherit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {


    public void Deserializeee() throws IOException, ClassNotFoundException {

        FileInputStream fis=new FileInputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\inh.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        UniversityEmployee ue=(UniversityEmployee) ois.readObject();
        System.out.println(ue.toString());

    }
}
