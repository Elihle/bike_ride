package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {
    @Test
    public void shouldRideMountainBike () {
        Bicycle mountainBike = new MountainBike();
        BikeRide bicycleRide = new BikeRideOne(mountainBike);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 36);
        mountainBike.brake();
        assertEquals(bicycleRide.currentSpeed(), 32);

    }

    @Test
    public void shouldRideRoadBike () {
        Bicycle roadBike = new RoadBike();
        BikeRide bicycleRide = new BikeRideOne(roadBike);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 14);
        roadBike.brake();
        assertEquals(bicycleRide.currentSpeed(), 11);

    }

    @Test
    public void shouldRideTandem () {
        Bicycle tandem = new Tandem();
        BikeRide bicycleRide = new BikeRideOne(tandem);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 34);
        tandem.brake();
        assertEquals(bicycleRide.currentSpeed(), 27);

    }

}
