package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BikeRide;

public class Tandem extends BicycleBase {

    @Override
    public void accelerate() {
        speed += 12;
    }

    @Override
    public void brake () {
        speed -= 7;
        if (speed < 0) {
            speed = 0;
        }

    }
}
