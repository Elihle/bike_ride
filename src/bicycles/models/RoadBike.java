package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleSpecification;
import bicycles.BicycleType;

public class RoadBike extends BicycleBase {
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
    public BicycleType getBicycleType() {
        return getBicycleType();
    }
}
