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
                processContainers(TrucksContainerAndBoxes.truckCapacity + spareTruckSpace, totalTruckCount);
            } else {
                processContainers(TrucksContainerAndBoxes.truckCapacity, totalTruckCount);
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

    private static void processContainers(int maxContainerCount, int totalTruckCount){
        int totalContainerCount = trucksContainerAndBoxes.getContainerNumber();
        for (int containerCounter = 1;
             containerCounter <= maxContainerCount; containerCounter++) {
            System.out.println("\tКонтейнер: " + containerCounter);
            int spareSpace = trucksContainerAndBoxes.totalBoxCount -
                    (totalTruckCount * totalContainerCount * TrucksContainerAndBoxes.containerCapacity);
            if (containerCounter == totalContainerCount) {
                for (int boxCounter = 1;
                     boxCounter <= TrucksContainerAndBoxes.containerCapacity + spareSpace;
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