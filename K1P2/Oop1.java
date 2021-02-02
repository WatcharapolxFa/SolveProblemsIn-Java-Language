public class Oop1 {
    public static void main(String[] args) {

    }

    public class Circle {
        double radius;
        String color;

        Circle() {
            radius = 1.0;
            color = "while";
        }

        Circle(double newReadius, String newColor) {
            radius = newReadius;
            color = newColor;
        }

        double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

}