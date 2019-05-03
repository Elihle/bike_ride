package bicycles.models;

import bicycles.Bicycle;

public class MountainBike implements Bicycle {
     int speed;

    @Override
    public void accelerate() {
        speed += 11;
    }

    @Override
    public void brake() {
        speed -= 4;
        if (speed < 0) {
            speed = 0;
        }
    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }
}
