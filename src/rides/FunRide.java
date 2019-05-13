package rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int maximum;

    public FunRide (int maximum) {
        this.maximum = maximum;
    }

    List<Bicycle> bicycles = new ArrayList<>();

    public String accept(Bicycle bicycle) {
        if (bicycles.size() < maximum && !bicycles.contains(bicycle)) {
            bicycles.add(bicycle);

            return "Accept";
        }
            return "Reject";
    }

    public int getEnteredCount () {
        return bicycles.size();
    }


    public int getCountForType (BicycleType bicycleType) {
        int counter = 0;

        for (Bicycle bicycle : bicycles) {
            if (bicycle.getBicycleType() == bicycleType) {
                counter++;
            }
        }
        return counter;
    }

}

