package models;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {

    @Test
    public void shouldAccelerateTandem () {
        Tandem tandem = new Tandem();
        tandem.accelerate();

        assertEquals(tandem.currentSpeed(), 5);
    }

    @Test
    public void shouldBrakeTandem () {
        Tandem tandem = new Tandem();
        tandem.brake();

        assertEquals(tandem.currentSpeed(), 34);
        tandem.brake();
        assertEquals(tandem.currentSpeed(), 27);

    }

    @Test
    public void shouldStopTandem () {
        Tandem tandem = new Tandem();
        tandem.stop();

        assertEquals(tandem.currentSpeed(), 34);
        tandem.stop();
        assertEquals(tandem.currentSpeed(), 0);

    }
}
