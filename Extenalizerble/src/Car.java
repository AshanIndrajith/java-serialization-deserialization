import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Vehicle implements Externalizable {

    private static final long serialVersionUID=287L;

    private double speed;

    private transient int geer;
    public Car() {
    }



    public Car(String color, double speed) {
        super(color);
        this.speed = speed;

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getGeer() {
        return geer;
    }

    public void setGeer(int geer) {
        this.geer = geer;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {


        out.writeObject(getColor());
        out.writeInt(getGeer());
        out.writeDouble(getGeer());

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

       setColor((String) in.readObject());
       setGeer(in.readInt());
       setSpeed(in.readInt());

    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", geer=" + geer +
                ", color=" + getColor() +

                '}';
    }
}
