import java.io.*;

public class Serializerble {




    public void Ser(Car c) throws IOException {

        FileOutputStream fio=new FileOutputStream("F:\\java-serialization-deserialization\\java-serialization-deserialization\\files\\text.txt");
        ObjectOutputStream ois=new ObjectOutputStream(fio);
        ois.writeObject(c);

    }
}
