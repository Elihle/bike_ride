package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideThree implements BikeRide {
    private Bicycle bicycle;

    public BikeRideThree (Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    @Override
    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
