package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccellerate () {
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());

        assertEquals(bikeRide.currentSpeed(), 14);

    }

    @Test
     void shouldStop() {
        Bicycle bicycle = new Bicycle();

        bicycle.accellerate();
        assertEquals(5, bicycle.currentSpeed());
        bicycle.stop();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    void shouldBrake() {
        Bicycle bicycle = new Bicycle();

        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());
    }
    }
