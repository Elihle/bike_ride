package bicycles.models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {
    int speed;

    @Override
    public void accelerate() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed -= 3;
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