import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {
    public static TrucksContainerAndBoxes trucksContainerAndBoxes;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        trucksContainerAndBoxes = new TrucksContainerAndBoxes();
        trucksContainerAndBoxes.distribution(in.nextInt());
        int totalTruckCount = trucksContainerAndBoxes.getTruckCount();
        int spareTruckSpace = trucksContainerAndBoxes.getContainerNumber() -
                (totalTruckCount * TrucksContainerAndBoxes.truckCapacity);
        for (int truckCounter = 1; truckCounter <= totalTruckCount; truckCounter++) {
            System.out.println("Грузовик: " + truckCounter);
            if (truckCounter == totalTruckCount) {
                processContainers(TrucksContainerAndBoxes.truckCapacity + spareTruckSpace, totalTruckCount, true);
            } else {
                processContainers(TrucksContainerAndBoxes.truckCapacity, totalTruckCount, false);
            }


        }
//        for (int i = 0; i < trucksContainerAndBoxes.totalBoxCount; i++) {
//            int box = i % 27 + 1;
//            int container = (i / 27) % 12 + 1;
//            int truck = (i / 27) / 12 + 1;
//            System.out.println("Грузовик: " + truck);
//            System.out.println("Контейнер: " + container);
//            System.out.println("Ящик: " + box);
//        }
        System.out.println("Необходимо: " + System.lineSeparator() +
                "грузовиков - " + trucksContainerAndBoxes.truckNumber + " шт." + System.lineSeparator() +
                "контейнеров - " + trucksContainerAndBoxes.containerNumber + " шт.");
    }

    private static void processContainers(int maxContainerCount, int totalTruckCount, boolean isLastTruck){
        int totalContainerCount = trucksContainerAndBoxes.getContainerNumber();
        for (int containerCounter = 1;
             containerCounter <= maxContainerCount; containerCounter++) {
            System.out.println("\tКонтейнер: " + containerCounter);
            int lastContainerBoxes = trucksContainerAndBoxes.totalBoxCount -
                    ((totalContainerCount - 1) * TrucksContainerAndBoxes.containerCapacity * Math.max(totalTruckCount - 1, 1));
            if (isLastTruck & containerCounter == maxContainerCount) {
                for (int boxCounter = 1;
                     boxCounter <= lastContainerBoxes;
                     boxCounter++) {
                    System.out.println("\t\tЯщик: " + boxCounter);
                }
            } else {
                for (int boxCounter = 1;
                     boxCounter <= TrucksContainerAndBoxes.containerCapacity;
                     boxCounter++) {
                    System.out.println("\t\tЯщик: " + boxCounter);
                }
            }
        }
    }
}