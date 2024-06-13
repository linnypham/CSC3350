package lab2;

public class Shape {
    String color;
    double area;

    Shape(String color){
        this.color  = color;
    }

    double calculateArea(){
        return area;
    }
    void draw(){
        System.out.println("*");
    }
    void getColor(){
        System.out.println("The color is "+color);
    }
}
class Circle extends Shape{
    int radius;

    Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        area = 2 * radius  * Math.PI;
        return area;
    }
    @Override
    void draw(){
        int x = 5;
        int y = 15;
        for (int i = 0; i <= x + radius; i++){
            for (int j = 1; j<= y + radius; j++){
                int xSquared = (i - x)*(i - x);
                int ySquared = (j - y)*(j - y);
                 if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }

    }
}
class Rectangle extends Shape{
    int diagonal;
    int height;
    int width;

    Rectangle(String color, int height, int width){
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    double calculateArea(){
        area = height * width;
        return area;
    }
    @Override
    void draw(){
        for (int w = 1; w <= width; w++) {
            for (int h = 1; h <= height; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Triangle extends Shape{
    int height;
    int base;
    int sideA;
    int sideB;
    Triangle(String color, int base, int sideA, int sideB){
        super(color);
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    double calculateArea(){
        area = (height * base)/2;
        return area;
    }
    @Override
    void draw(){
        System.out.println("Draw a Triangle.");
    }
}
public interface ColoredShape{
    String getColor();
}
public abstract class ColoredShapeDecorator{
    implements ColoredShape{

    }
}
class Main{
    public static void main(String[] args){
    Circle circle = new Circle("red",5);
    circle.getColor();
    Rectangle rectangle = new Rectangle("red",50,5);
    Triangle triangle = new Triangle("red",5,5,5);
    }
}