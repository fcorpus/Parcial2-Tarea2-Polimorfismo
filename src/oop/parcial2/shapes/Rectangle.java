package oop.parcial2.shapes;

public class Rectangle extends Shape{
    private double base;
    private double height;
    public Rectangle(){
        super("Rectangulo");
    }
    public Rectangle(double base, double height){
        this();
        this.base = base;
        this.height = height;
    }
    public String toString() {
        return "█";
    }
    public double getArea() {
        return base*height;
    }
    public double getPerimeter() {
        return (2*height)+(2*base);
    }
    public int getSidesCount() {
        return 4;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
