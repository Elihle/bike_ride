package bicycles;

public class BicycleSpecification {

    private final BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    enum BicycleType {
        RoadBike,
        MountainBike,
        Tandem

    }
        public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
            this.bicycleType = bicycleType;
        }

        public BicycleType getBicycleType() {
            return bicycleType;
        }

        public int getAccelerationSpeed() {
            return accelerationSpeed;
        }

        public int getBrakeSpeed() {
            return brakeSpeed;
        }

}