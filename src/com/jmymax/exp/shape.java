package com.jmymax.exp;

public abstract class shape {
    public abstract double perimeter();

    public abstract double area();

    public abstract String toString();

    public int comparePerimeter(shape other) {
        double current = this.perimeter();
        double target = other.perimeter();
        return Double.compare(current, target);
    }

    public int compareArea(shape other) {
        double current = this.area();
        double target = other.area();
        return Double.compare(current, target);
    }
}
