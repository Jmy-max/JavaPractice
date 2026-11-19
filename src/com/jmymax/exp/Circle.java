package com.jmymax.exp;

import java.awt.*;

public class Circle extends shape {
    private double r;
    private double perimeter;
    private double area;

    public Circle(double r) {
        this.r = r;
    }

    public double perimeter(){
        perimeter = 2 * Math.PI * r;
        return perimeter;
    }
    public double area(){
        area = Math.PI * r * r;
        return area;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public String toString() {
        return "Circle( perimeter = " + perimeter() + ", area = " + area() +  ")";
    }
}
