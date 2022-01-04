public class Main {
    public static void main(String[] args) {
        GeometryCalculator calculator = new GeometryCalculator();
        System.out.println(calculator.getCircleArea(1));
        System.out.println(calculator.getSphereVolume(2));
        calculator.getTriangleArea(1, 1, 3);

    }
}
