package oop.parcial2.shapes;

public class Circle extends Shape{
    private double radio;
    public Circle(){
        super("Circulo");
    }
    public Circle(double radio){
        this();
        this.radio = radio;
    }

    public String toString() {
        return "○";
    }

    public double getArea() {
        return Math.PI*radio*radio;
    }
    public double getPerimeter() {
        return Math.PI*radio*2;
    }
    public int getSidesCount() {
        return 0;
    }
    public double getRadio(){
        return radio;
    }
}
