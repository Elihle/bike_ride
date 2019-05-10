package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunRideTest {
    @Test
    public void shouldAcceptRide () {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, 3, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        FunRide funRide = new FunRide(2);

        assertEquals(funRide.accept(roadBike), "Accept");
        assertEquals(funRide.accept(mountainBike), "Accept");

    }

    @Test
    public void shouldReturnEnteredCount () {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, 3, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        FunRide funRide = new FunRide(5);

        assertEquals(funRide.accept(roadBike), "Accept");
        assertEquals(funRide.accept(mountainBike), "Accept");
        assertEquals(funRide.accept(mountainBike), "Accept");
        funRide.getEnteredCount();
        assertEquals(funRide.getEnteredCount(), 3);
    }

}