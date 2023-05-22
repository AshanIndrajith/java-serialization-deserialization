package ParentInheriton;

import java.io.Serializable;

public class Animal implements Serializable {

    private double Speed;

    public Animal(double speed) {
        Speed = speed;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }
}
