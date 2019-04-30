package bicycles;

public class Bicycle {
    private int speed = 0;

    public void accellerate () {
       speed += 5;
    }

    public void brake () {
        speed -= 3;
    }

    public void currentSpeed () {
        speed += 2;
    }

    public void stop () {
    speed += 0;
    }



}
