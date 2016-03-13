package carworkshop.task;

/**
 * Created by maverick on 13/3/16.
 */
public class CarRepair extends AbstractTask{

    private static CarRepair carRepair;
    public static CarRepair getInstance(){
        if(carRepair == null)
            carRepair = new CarRepair();

        return carRepair;
    }
    public CarRepair(){
        this.name = "Car-Repair";
        this.timeTaken = 5;
        this.serviceFee = 1000;
    }
}
