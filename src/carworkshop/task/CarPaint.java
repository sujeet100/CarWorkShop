package carworkshop.task;

/**
 * Created by maverick on 13/3/16.
 */
public class CarPaint extends AbstractTask{
    private static CarPaint carPaint;
    public static CarPaint getInstance(){
        if(carPaint == null)
            carPaint = new CarPaint();

        return carPaint;
    }
    
    public CarPaint(){
        this.name = "Car-Paint";
        this.timeTaken = 4;
        this.serviceFee = 1100;
    }
}
