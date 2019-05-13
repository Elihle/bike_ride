package specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoadBikeSpecTest {
    @Test
    public void shouldRideRoadBikeSpec () {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        bicycle.accelerate();

        assertEquals(bicycle.currentSpeed(), 11);
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(), 7);
    }


}
