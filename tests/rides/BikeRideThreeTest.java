package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {
    @Test
    public void shouldRideMountainBike () {
        Bicycle mountainBike = new MountainBike();
        BikeRide bicycleRide = new BikeRideThree(mountainBike);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 18);
        mountainBike.brake();
        assertEquals(bicycleRide.currentSpeed(), 14);

    }

    @Test
    public void shouldRideRoadBike () {
        Bicycle roadBike = new RoadBike();
        BikeRide bicycleRide = new BikeRideThree(roadBike);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 7);
        roadBike.brake();
        assertEquals(bicycleRide.currentSpeed(), 4);

    }

    @Test
    public void shouldRideTandem () {
        Bicycle tandem = new Tandem();
        BikeRide bicycleRide = new BikeRideThree(tandem);
        bicycleRide.ride();

        assertEquals(bicycleRide.currentSpeed(), 17);
        tandem.brake();
        assertEquals(bicycleRide.currentSpeed(), 10);

    }
}
