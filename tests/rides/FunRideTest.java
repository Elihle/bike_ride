package rides;
import bicycles.Bicycle;
import bicycles.BicycleType;
import specification.BicycleFromSpec;
import specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunRideTest {
    @Test
    public void shouldAcceptRides () {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, 3, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(10, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification tandemSpec = new BicycleSpecification(7, 3, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);

        FunRide funRide = new FunRide(6);

        assertEquals(funRide.accept(roadBike), "Accept");
        assertEquals(funRide.accept(mountainBike), "Accept");
        assertEquals(funRide.accept(tandem), "Accept");
        assertEquals(funRide.accept(mountainBike), "Reject");


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
        assertEquals(funRide.accept(mountainBike), "Reject");
        assertEquals(funRide.getEnteredCount(), 2);

    }


    @Test
    public void shouldReturnBikeType () {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, 3, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        FunRide funRide = new FunRide(2);
        funRide.accept(roadBike);

        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 1);
    }

}