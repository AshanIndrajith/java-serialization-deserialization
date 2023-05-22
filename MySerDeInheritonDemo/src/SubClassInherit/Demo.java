package SubClassInherit;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Serialize se=new Serialize();
        UniversityEmployee ue=new UniversityEmployee("ashan",10,2);
        se.UniversitySer(ue);

         Deserialize de=new Deserialize();
         de.Deserializeee();

    }
}
