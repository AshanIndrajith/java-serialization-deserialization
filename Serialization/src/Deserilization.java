import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {

    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\INSIGHT\\Desktop\\New folder\stu.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student stu=(Student)ois.readObject();
            System.out.println("Id "+stu.getId());
            System.out.println("Name "+stu.getName());
            System.out.println("age "+Student.getAge());
            System.out.println("password "+stu.getPassword());

            fis.close();
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
