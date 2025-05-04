package org.example;


public class Triangle implements Shape {

    private final double sideA;
    private final double sideB;
    private final double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Triangle sides cannot be zero");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Triangle inequality violated");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getSideA() {
        return sideA;
    }


    public double getSideB() {
        return sideB;
    }


    public double getSideC() {
        return sideC;
    }

    @Override
    public double calculateArea() {
        if (getType().equals("Equilateral Triangle")) {
            return (Math.sqrt(3) / 4) * sideA * sideA;
        }
        return 0.5 * sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
      return sideA + sideB + sideC;
    }

    @Override
    public String getType() {
        if(sideA == sideB && sideB == sideC){
            return "Equilateral Triangle";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "Isosceles Triangle";
        }else {
            return "Scalene Triangle";
        }
    }

    @Override
    public String toString() {
        return getType() +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC;
    }
}