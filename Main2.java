abstract class Shape {
    abstract double calculateArea();
    
    double calculateArea(int base, int height) {
        return 0.5 * base * height;
    }
}

class Triangle extends Shape {
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return calculateArea(base, height);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 3);

        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Triangle with given base and height: " + triangle.calculateArea(6, 4));
    }
}
