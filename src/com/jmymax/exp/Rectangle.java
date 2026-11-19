package com.jmymax.exp;

public class Rectangle extends shape {
    private double l;
    private double s;
    private double area;
    private double perimeter;
    public Rectangle(double l, double s) {
        this.l = l;
        this.s = s;
    }
    public double perimeter() {
        perimeter = (l + s) * 2;
        return perimeter;
    }
    public double area() {
        area = l * s;
        return area;
    }
    public double getl() {
        return l;
    }
    public double gets() {
        return s;
    }
    public void setl(double l) {
        this.l = l;
    }
    public void sets(double s) {
        this.s = s;
    }
    public String toString() {
        return "Rectangle( perimeter = " + perimeter() + ", area = " + area() + " )";
    }
}
