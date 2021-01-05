import java.util.List;

public class Storage{
    private Integer boxCounter;
    List<Robot> robots;
    
    public Storage(List<Robot> robots){
        this.robots = robots;
        this.boxCounter = 0;
    }
    
    public void oneDayAtWork(Integer chargeUnit, Integer boxToLoad){
        boxToLoad += this.boxCounter;
        System.out.println("Box for today: " + boxToLoad);
        for (Robot robot : this.robots){
            boxToLoad = robot.chargeAndLoad(chargeUnit, boxToLoad);
        }
        this.boxCounter = boxToLoad;
        System.out.println("Remained box for tomorrow: " + this.boxCounter);
    }
}
