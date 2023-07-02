import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilization {

    public static void main(String[] args) {
        Student st=new Student(1,"nimal");
        Student.setAge(32.5);
        st.setPassword(23l);

        try {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\INSIGHT\\Desktop\\New folder\stu.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.flush();
            fos.close();
            oos.close();


            System.out.println("completed");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
