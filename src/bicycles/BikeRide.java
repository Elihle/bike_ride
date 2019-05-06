package bicycles;

public class BikeRide {
    private Bicycle bicycle;

//    constructor
    public BikeRide (Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride () {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        System.out.println(bicycle.currentSpeed());

    }

    public int currentSpeed () {
       return this.bicycle.currentSpeed();
    }
}

