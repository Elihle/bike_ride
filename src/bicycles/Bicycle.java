package bicycles;

public class Bicycle {
    private int speed;

    public void accellerate () {
        speed += 5;
    }

    public void brake () {
        speed -= 3;
        if (speed < 0 ) {
            speed = 0;
        }
    }

    public int currentSpeed () {
        return speed;
    }

    public void stop () {
        speed = 0;
    }

}
