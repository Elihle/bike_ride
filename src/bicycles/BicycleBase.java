package bicycles;

public abstract class BicycleBase implements Bicycle {
    protected int speed;

    public void changeSpeed(int result) {
        speed += result;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public BicycleType getBicycleType() {
        return this.getBicycleType();
    }
}
