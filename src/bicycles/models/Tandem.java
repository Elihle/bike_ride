package bicycles.models;

import bicycles.*;

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

    @Override
    public BicycleType getBicycleType() {
        return getBicycleType();
    }
}
