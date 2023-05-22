import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        Serializerble se=new Serializerble();
        Car c=new Car("white",4.5);


        Deserialize de=new Deserialize();
        de.Deser();

        try {
            se.Ser(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}