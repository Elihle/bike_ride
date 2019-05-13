package specification;
import static org.junit.jupiter.api.Assertions.assertEquals;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

public class TandemSpecTest {
    @Test
    public void shouldRideTandemSpec () {
        BicycleSpecification tandemSpec = new BicycleSpecification(5, -3, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        bicycle.accelerate();

        assertEquals(bicycle.currentSpeed(), 5);
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(), 2);


    }


}
