package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {
    @Override
    public void accelerate() {
        speed += 11;
        System.out.println(speed);
    }

    @Override
    public void brake() {
        speed -= 4;
        if (speed < 0) {
            speed = 0;
        }
    }
}
