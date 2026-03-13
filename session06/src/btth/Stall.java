package btth;

public class Stall implements Runnable{
    private String stallName;
    private TrainStation trainStation;

    public Stall() {
    }

    public Stall(String stallName, TrainStation trainStation) {
        this.stallName = stallName;
        this.trainStation = trainStation;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public TrainStation getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(TrainStation trainStation) {
        this.trainStation = trainStation;
    }

    @Override
    public synchronized void run() {
        while (trainStation.getCounter() > 0) {
            trainStation.sellTicket(stallName);
        }
    }
}
