import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Storage storage = new Storage(generateRobots());

        simulateHardWork(storage, generateDays());
    }

    public static void simulateHardWork(Storage storage, List<Integer[]> days){
        for (Integer[] day : days) storage.oneDayAtWork(day[0], day[1]);
    }
    public static List<Robot> generateRobots(){
        return new ArrayList<>(Arrays.asList(
                new Mac("R2", 4),
                new Eco("C3PO", 3),
                new Pro("BB8", 10),
                new Eco("E12", 4)
        ));
    }
    public static List<Integer[]> generateDays(){
        return new ArrayList<>(Arrays.asList(
                new Integer[]{3, 20},
                new Integer[]{2, 32},
                new Integer[]{5, 20},
                new Integer[]{3, 16}
        ));
    }
}
