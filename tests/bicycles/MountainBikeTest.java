package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void shouldAccelerateMountainBike () {
        BicycleBase mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();

        assertEquals(mountainBike.currentSpeed(), 36);
    }

    @Test
    public void shouldBrakeMountainBike() {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(mountainBike);
        bikeRide.ride();

        assertEquals(mountainBike.currentSpeed(), 36);
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(), 32);
    }

    @Test
    public void shouldStopMountainBike () {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(mountainBike);
        bikeRide.ride();

        assertEquals(mountainBike.currentSpeed(), 36);
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(), 0);
    }
}
