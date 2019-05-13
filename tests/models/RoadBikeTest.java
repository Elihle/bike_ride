package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public void shouldAccelerateRoadBike () {
        RoadBike roadBike = new RoadBike();

        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(), 14);
    }

    @Test
    public void shouldBrakeRoadBike () {
        RoadBike roadBike = new RoadBike();

        assertEquals(roadBike.currentSpeed(), 14);
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(), 11);
    }

    @Test
    public void shouldStopRoadBike () {
        RoadBike roadBike = new RoadBike();

        assertEquals(roadBike.currentSpeed(), 14);
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(), 0);
    }

}
