//package bicycles;
//
//import org.junit.jupiter.api.Test;
//
//public class mountainBikeSpecTest {
//    @Test
//    BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
//    Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
//    BikeRide mBikeRide = new BikeRide(mountainBike);
//    mBikeRide.ride();
//}


package bicycles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MountainBikeSpecTest {
    @Test
    public void shouldRideMountainBikeSpec () {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.RoadBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 26);

    }


}
