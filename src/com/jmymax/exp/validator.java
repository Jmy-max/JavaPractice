package com.jmymax.exp;

public class validator implements TriangleValidator {
    @Override
    public boolean isValid(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0
                && a + b > c && a + c > b
                && b + c > a;
    }
}
