public class AreaCalculator {
    public static void main(String[] args) {
        double CircleArea = area(56);
        System.out.println("Area of a circle is: "+ CircleArea);
        double RectangleArea = area(5,6);
        System.out.println("Area of rectangle is: " + RectangleArea);

    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;

        }
        double circle = radius * radius * Math.PI;
        return circle;

    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;

        }
        double rectangle = x * y;
        return rectangle;

    }
}