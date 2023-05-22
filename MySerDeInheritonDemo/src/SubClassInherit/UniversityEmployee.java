package SubClassInherit;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UniversityEmployee extends Employee implements Serializable {

    private int uid;



    public UniversityEmployee(String name, int age, int uid) {
        super(name, age);
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    private void writeObject(ObjectOutputStream oos) throws IOException {

        oos.defaultWriteObject();
        oos.writeObject(getName());
        oos.writeInt(getAge());
        oos.writeInt(getUid());

    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        setName((String) ois.readObject());
        setAge(ois.readInt());
        setUid(ois.readInt());


    }

    @Override
    public String toString() {
        return "UniversityEmployee{" +
                "uid=" + uid +
                "name=" + getName() +
                "id=" + getAge() +
                '}';
    }
}
