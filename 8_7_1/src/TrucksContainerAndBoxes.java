public class TrucksContainerAndBoxes {

    public int truckNumber;

    public static final int containerCapacity = 27;
    public static final int truckCapacity = 12;

    public int getTruckCount() {
        if (containerNumber % 12 == 0) {
            truckNumber = containerNumber / 12;
        } else truckNumber = containerNumber / 12 + 1;
        return truckNumber;
    }
    public int containerNumber;

    public int getContainerNumber() {
        if (totalBoxCount % 27 == 0) {
            containerNumber = totalBoxCount / 27;
        } else containerNumber = totalBoxCount / 27 + 1;
        return containerNumber;
    }

    public int totalBoxCount;

    public void distribution(int boxNumber) {
        this.totalBoxCount = boxNumber;
        getContainerNumber();
        getTruckCount();
    }
}