package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public void shouldAccelerateRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(roadBike);
        bikeRide.ride();

        assertEquals(roadBike.currentSpeed(), 14);
    }

    @Test
    public void shouldBrakeRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(roadBike);
        bikeRide.ride();

        assertEquals(roadBike.currentSpeed(), 14);
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(), 11);
    }

    @Test
    public void shouldStopRoadBike () {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(roadBike);
        bikeRide.ride();

        assertEquals(roadBike.currentSpeed(), 14);
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(), 0);
    }

}
