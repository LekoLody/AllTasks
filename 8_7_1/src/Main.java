import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TrucksContainerAndBoxes trucksContainerAndBoxes = new TrucksContainerAndBoxes();
        trucksContainerAndBoxes.distribution(in.nextInt());
        System.out.println("Необходимо: " + System.lineSeparator() +
                "грузовиков - " + trucksContainerAndBoxes.truckNumber + " шт." + System.lineSeparator() +
                "контейнеров - " + trucksContainerAndBoxes.containerNumber + " шт.");
    }

}