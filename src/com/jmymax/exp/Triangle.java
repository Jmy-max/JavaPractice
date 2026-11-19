package com.jmymax.exp;

public class Triangle extends shape {
    private double a;
    private double b;
    private double c;
    private double perimeter;
    private double area;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {
        double p;
        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
    public double perimeter() {
        perimeter = a + b + c;
        return perimeter;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public String toString(){
        return "Triangle ( perimeter = " + perimeter() + "，area = " + area() + " )";
    }
}
