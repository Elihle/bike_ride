package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int maximum;
//    private Bicycle Bicycle;

    public FunRide (int maximum) {
        this.maximum = maximum;
    }

    List<Bicycle> bicycles = new ArrayList<>();

    public String accept(Bicycle bicycle) {
        if (bicycles.size() <= maximum) {
            bicycles.add(bicycle);

            return "Accept";
        }
            return "Reject";
    }

    public int getEnteredCount () {
        return bicycles.size();
    }


    public void getCountForType () {



    }

}

