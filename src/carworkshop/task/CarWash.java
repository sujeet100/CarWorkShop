package carworkshop.task;

/**
 * Created by maverick on 13/3/16.
 */
public class CarWash extends AbstractTask{

    private static CarWash carWash;
    public static CarWash getInstance(){
        if(carWash == null)
            carWash = new CarWash();

        return carWash;
    }

    private CarWash(){
        this.name = "Car-Wash";
        this.timeTaken = 2;
        this.serviceFee = 100;
    }
}
