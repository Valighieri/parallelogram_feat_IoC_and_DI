package com.valentyn.spring.my_test.quadrangles;

import com.valentyn.spring.my_test.triangle.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.Math.*;

@Component("parallelogramBean")
public class Parallelogram extends Quadrangle {

    private double sideA;
    private double sideB;
    private double diagonalD1;
    private double diagonalD2;
    private double angleA;
    private double angleB;
    private Triangle triangle;

    public Parallelogram(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        System.out.println("Parallelogram is special quadrangle! \n");
    }

    public Parallelogram() {
    }

    @Override
    public void showInfoAboutFigure() {
        System.out.println("Parallelogram sides = " + sideA + ", " + sideB + ";");
        System.out.println("Parallelogram diagonals = " + diagonalD1 + ", " + diagonalD2 + ";");
        System.out.println("Parallelogram angles = " + toDegrees(angleA) + ", " + toDegrees(angleB) + ";\n");
    }

    @Override
    public void showMainProperties() {
        super.showMainProperties();
        System.out.println("P1. The opposite sides are parallel and equal");
        System.out.println("P2. The opposite angles are equal");
        System.out.println("P3. The two diagonals bisect each other\n");
    }

    @Override
    public void findAngle() {
        angleA = triangle.theoremCos();
        System.out.println("Done! <A = " + toDegrees(angleA) + "\n");
    }

    @Autowired
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
        this.diagonalD1 = triangle.getSideA();
        this.sideA = triangle.getSideB();
        this.sideB = triangle.getSideC();
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getDiagonalD1() {
        return diagonalD1;
    }

    public void setDiagonalD1(double diagonalD1) {
        this.diagonalD1 = diagonalD1;
    }

    public double getDiagonalD2() {
        return diagonalD2;
    }

    public void setDiagonalD2(double diagonalD2) {
        this.diagonalD2 = diagonalD2;
    }

    public double getAngleA() {
        return toDegrees(angleA);
    }

    public void setAngleA(double angleA) {
        this.angleA = toRadians(angleA);
    }

    public double getAngleB() {
        return toDegrees(angleB);
    }

    public void setAngleB(double angleB) {
        this.angleB = toRadians(angleB);
    }


}
