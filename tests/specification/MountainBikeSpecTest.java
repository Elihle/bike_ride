//package bicycles;
//
//import org.junit.jupiter.api.Test;
//
//public class mountainBikeSpecTest {
//    @Test
//    specification mountainBikeSpec = new specification(5, 3);
//    bicycles mountainBike = new BicycleFromSpec(mountainBikeSpec);
//    rides mBikeRide = new rides(mountainBike);
//    mBikeRide.ride();
//}


package specification;
import static org.junit.jupiter.api.Assertions.assertEquals;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

public class MountainBikeSpecTest {
    @Test
    public void shouldRideMountainBikeSpec () {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(10, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        bicycle.accelerate();

        assertEquals(bicycle.currentSpeed(), 10);
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(), 7);


    }


}
