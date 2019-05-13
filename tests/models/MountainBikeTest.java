package models;

import bicycles.BicycleBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void shouldAccelerateMountainBike () {
        BicycleBase mountainBike = new MountainBike();
        mountainBike.accelerate();

        assertEquals(mountainBike.currentSpeed(), 11);
    }

    @Test
    public void shouldBrakeMountainBike() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();

        assertEquals(mountainBike.currentSpeed(), 11);
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(), 7);
    }

    @Test
    public void shouldStopMountainBike () {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();

        assertEquals(mountainBike.currentSpeed(), 11);
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(), 0);
    }
}
