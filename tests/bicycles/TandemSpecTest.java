package bicycles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TandemSpecTest {
    @Test
    public void shouldRideTandemSpec () {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.Tandem);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 26);

    }


}
