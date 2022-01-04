public class TrucksContainerAndBoxes {

    public int truckNumber;

    public int getTruckNumber() {
        if (containerNumber % 27 == 0) {
            truckNumber = containerNumber / 12;
        } else truckNumber = containerNumber / 12 + 1;
        return truckNumber;
    }

    public int getContainerNumber() {
        if (boxNumber % 27 == 0) {
            containerNumber = boxNumber / 27;
        } else containerNumber = boxNumber / 27 + 1;
        return containerNumber;
    }

    public int containerNumber;
    public int boxNumber;

    public void distribution(int boxNumber) {
        this.boxNumber = boxNumber;
        getContainerNumber();
        getTruckNumber();
    }
}