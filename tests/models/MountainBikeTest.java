package models;

import bicycles.BicycleBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void shouldAccelerateMountainBike () {
        BicycleBase mountainBike = new MountainBike();
        mountainBike.accelerate();

        assertEquals(mountainBike.currentSpeed(), 36);
    }

    @Test
    public void shouldBrakeMountainBike() {
        MountainBike mountainBike = new MountainBike();

        assertEquals(mountainBike.currentSpeed(), 36);
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(), 32);
    }

    @Test
    public void shouldStopMountainBike () {
        MountainBike mountainBike = new MountainBike();

        assertEquals(mountainBike.currentSpeed(), 36);
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(), 0);
    }
}
