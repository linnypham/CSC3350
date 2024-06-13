package lab2;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract void draw();
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius + " and color " + getColor());
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width " + width + ", height " + height + " and color " + getColor());
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with base " + base + ", height " + height + " and color " + getColor());
    }
}

class ColoredShapeDecorator extends Shape {
    private Shape decoratedShape;
    private String newColor;

    public ColoredShapeDecorator(Shape decoratedShape, String newColor) {
        super(decoratedShape.getColor());
        this.decoratedShape = decoratedShape;
        this.newColor = newColor;
    }
    @Override
    public String getColor() {
        return newColor;
    }
    @Override
    public double calculateArea() {
        return decoratedShape.calculateArea();
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape with new color: " + newColor);
    }


}

interface DrawingStrategy {
    void draw();
}

class ConsoleDrawingStrategy implements DrawingStrategy {
    @Override
    public void draw() {
        System.out.println("Drawing using Console Drawing Strategy");
    }
}

class GraphicsDrawingStrategy implements DrawingStrategy {
    @Override
    public void draw() {
        System.out.println("Drawing using Graphics Drawing Strategy");
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 6);
        Shape rectangle = new Rectangle("Blue", 6, 9);
        Shape triangle = new Triangle("Green", 6, 9);

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
            shape.draw();
            System.out.println();
        }

        Shape coloredCircle = new ColoredShapeDecorator(circle, "Yellow");
        System.out.println("Decorated Circle Area: " + coloredCircle.calculateArea());
        coloredCircle.draw();

        DrawingStrategy consoleStrategy = new ConsoleDrawingStrategy();
        DrawingStrategy graphicsStrategy = new GraphicsDrawingStrategy();

        System.out.println();
        consoleStrategy.draw();
        graphicsStrategy.draw();
    }
}
