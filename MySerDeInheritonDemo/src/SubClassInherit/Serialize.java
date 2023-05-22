package SubClassInherit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

    public void UniversitySer(UniversityEmployee ue){

        try {
            FileOutputStream fos=new FileOutputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\inh.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(ue);
            oos.flush();
            oos.close();
            fos.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
