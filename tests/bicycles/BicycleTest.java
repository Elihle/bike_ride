package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

//    MountainBike Tests
    @Test
    public void shouldAccelerate () {
        BicycleBase mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();

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
        MountainBike mountainBike = new MountainBike();
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

//    Tandem Tests
    @Test
    public void shouldStopRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRide(roadBike);
        bikeRide.ride();

        assertEquals(roadBike.currentSpeed(), 14);
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(), 0);
    }

    @Test
    public void shouldAccelerateTandem () {
        Tandem tandem = new Tandem();
        BikeRide bikeRide = new BikeRide(tandem);
        bikeRide.ride();

        assertEquals(tandem.currentSpeed(), 34);
    }

    @Test
    public void shouldBrakeTandem () {
        Tandem tandem = new Tandem();
        BikeRide bikeRide = new BikeRide(tandem);
        bikeRide.ride();

        assertEquals(tandem.currentSpeed(), 34);
        tandem.brake();
        assertEquals(tandem.currentSpeed(), 27);

    }

//    BikeRideOne Test
    @Test
    public void shouldBrakeTandem () {
        BikeRideOne bikeRideOne = new BikeRideOne();
        BikeRide bikeRide = new BikeRide(bikeRideOne);
        bikeRide.ride();

        assertEquals(bikeRideOne.currentSpeed(), 34);
        bikeRideOne.brake();
        assertEquals(bikeRideOne.currentSpeed(), 27);

}

    }

