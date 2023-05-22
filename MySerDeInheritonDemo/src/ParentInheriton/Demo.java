package ParentInheriton;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) {

        Serialize se=new Serialize();
        Cat c=new Cat(10.2,"white");

        se.Serialize(c);

        Deserialize de=new Deserialize();
        try {
            de.Deserializeee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
