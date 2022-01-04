public class GeometryCalculator {

    public double circleRadius;
    public double triangleSide1;
    public double triangleSide2;
    public double triangleSide3;
    public double sphereRadius;
    public double halfPerimeter;
    public double triangleArea;

    public double getCircleArea(int circleRadius) {
        this.circleRadius = circleRadius;
        return circleRadius * Math.PI;
    }

    public double getTriangleArea(double triangleSide1, double triangleSide2, double triangleSide3) {
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
        this.triangleSide3 = triangleSide3;
        double halfPerimeter = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
        triangleArea = Math.sqrt(halfPerimeter *
                (halfPerimeter - triangleSide1) *
                (halfPerimeter - triangleSide2) *
                (halfPerimeter - triangleSide3));
        if (triangleExist()) {
            System.out.println("Triangle exist");
            System.out.println(triangleArea);
            return triangleArea;
        } else System.out.println("Triangle didn't exist");
        return 0;
    }

    public double getSphereVolume(int sphereRadius) {
        this.sphereRadius = sphereRadius;
        return ((double) 4 / 3) * Math.PI * Math.pow(sphereRadius, 3);
    }

    public boolean triangleExist() {
        return triangleSide1 + triangleSide2 > triangleSide3 &
                triangleSide2 + triangleSide3 > triangleSide1 &
                triangleSide1 + triangleSide3 > triangleSide2;
    }

}
