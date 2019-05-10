package bicycles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TandemSpecTest {
    @Test
    public void shouldRideTandemSpec () {
        BicycleSpecification tandemSpec = new BicycleSpecification(5, 3, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        BikeRide mBikeRide = new BikeRideOne(tandem);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 26);

    }


}
