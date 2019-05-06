package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

//    MountainBike Tests
    @Test
    public void shouldAccelerate () {
        Bicycle mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.ride();

        assertEquals(mountainBike.currentSpeed(), 36);
    }

    @Test
    public void shouldBrakeMountainBike() {
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.ride();

        assertEquals(mountainBike.currentSpeed(), 36);
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(), 32);
    }

    @Test
    public void shouldStopMountainBike () {
        Bicycle mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.ride();

        assertEquals(mountainBike.currentSpeed(), 36);
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(), 0);
    }

//    RoadBike Tests
    @Test
    public void shouldAccelerateRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRide(roadBike);
        bikeRide.ride();

        assertEquals(roadBike.currentSpeed(), 14);
    }

    @Test
    public void shouldBrakeRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRide(roadBike);
        bikeRide.ride();

        assertEquals(roadBike.currentSpeed(), 14);
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(), 11);
    }

    @Test
    public void shouldStopRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRide(roadBike);
        bikeRide.ride();

        assertEquals(roadBike.currentSpeed(), 14);
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(), 0);
    }

    }
