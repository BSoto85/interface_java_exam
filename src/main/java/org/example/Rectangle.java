package org.example;


public class Rectangle implements Shape {

    private final double width;
    private final double height;


    public Rectangle(double width, double height) {
        if(width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than 0");
        }
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getType() {
        if(width == height) {
            return "Square";
        }
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getType() + " with width " + width + " and height " + height;
    }
}