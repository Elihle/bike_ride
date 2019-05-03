package bicycles;

public class BikeRide {
    private Bicycle bicycle;

    //    constructor
    public BikeRide (Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride () {
        this.bicycle.accellerate();
        this.bicycle.accellerate();
        this.bicycle.accellerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accellerate();

    }

    public int currentSpeed () {
        return this.bicycle.currentSpeed();
    }
}

