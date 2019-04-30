package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    Bicycle bike = new Bicycle();
    public void shouldAccellerate () {
        assertEquals(bike.accellerate(), 5);

    }
    }
