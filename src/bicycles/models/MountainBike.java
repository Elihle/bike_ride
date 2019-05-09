package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleSpecification;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {
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
    public BicycleType getBicycleType() {
        return getBicycleType();
    }
}
