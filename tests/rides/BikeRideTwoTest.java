package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {
    @Test
    public void shouldRideMountainBike () {
        Bicycle mountainBike = new MountainBike();
        BikeRide bicycleRide = new BikeRideTwo(mountainBike);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 14);
        mountainBike.brake();
        assertEquals(bicycleRide.currentSpeed(), 10);

    }

    @Test
    public void shouldRideRoadBike () {
        Bicycle roadBike = new RoadBike();
        BikeRide bicycleRide = new BikeRideTwo(roadBike);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 5);
        roadBike.brake();
        assertEquals(bicycleRide.currentSpeed(), 2);

    }

    @Test
    public void shouldRideTandem () {
        Bicycle tandem = new Tandem();
        BikeRide bicycleRide = new BikeRideTwo(tandem);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 12);
        tandem.brake();
        assertEquals(bicycleRide.currentSpeed(), 5);

    }

}
