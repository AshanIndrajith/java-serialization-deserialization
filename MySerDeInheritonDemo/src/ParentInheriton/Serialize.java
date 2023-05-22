package ParentInheriton;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {


    FileOutputStream fos;

    public void Serialize(Cat c){

        try {
            fos=new FileOutputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\file.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.flush();
            oos.close();
            fos.close();

            System.out.println("completed");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
