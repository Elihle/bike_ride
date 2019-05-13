package bicycles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import specification.BicycleSpecification;


public class BicycleTest {

    @Test
    public void shouldAccelerate () {
        BicycleSpecification bicycle = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        assertEquals(bicycle.getAccelerationSpeed(), 5);
    }

    @Test
    void shouldStop() {

        BicycleSpecification bicycle = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        assertEquals(bicycle.getAccelerationSpeed(), 5);
    }

    @Test
    void shouldBrake() {
        BicycleSpecification bicycle = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        assertEquals(bicycle.getAccelerationSpeed(), 5);
    }
}