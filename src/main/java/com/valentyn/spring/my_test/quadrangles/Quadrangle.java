package com.valentyn.spring.my_test.quadrangles;

public abstract class Quadrangle {
    public final static int angles = 4;
    public final static int sumOfAngles = 360;

    public abstract void showInfoAboutFigure();
    public void showMainProperties(){
        System.out.print("Q1. Sum of " + angles + " angles of a quadrangle = " + sumOfAngles);
    }
    public abstract void findAngle();
}
