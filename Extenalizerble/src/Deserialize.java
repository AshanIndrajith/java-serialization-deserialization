import java.io.*;

public class Deserialize {

    public void Deser(){


        try {
            FileInputStream fis=new FileInputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\text.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Car ca= (Car) ois.readObject();
            System.out.println(ca.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
