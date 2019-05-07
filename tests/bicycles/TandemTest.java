package bicycles;

import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {



    @Test
    public void shouldAccelerateTandem () {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRide = new BikeRideOne(tandem);
        bikeRide.ride();

        assertEquals(tandem.currentSpeed(), 34);
    }

    @Test
    public void shouldBrakeTandem () {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRide = new BikeRideOne(tandem);
        bikeRide.ride();

        assertEquals(tandem.currentSpeed(), 34);
        tandem.brake();
        assertEquals(tandem.currentSpeed(), 27);

    }
}
