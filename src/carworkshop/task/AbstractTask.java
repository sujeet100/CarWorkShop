package carworkshop.task;

/**
 * Created by maverick on 13/3/16.
 */
public abstract class AbstractTask implements Task {
    protected String name;
    protected Integer serviceFee;
    protected Integer timeTaken;

    @Override
    public Integer getTimeTaken() {
        return timeTaken;
    }

    @Override
    public Integer getServiceFee() {
        return serviceFee;
    }

    @Override
    public String getName() {
        return name;
    }

}
