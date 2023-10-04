package com.valentyn.spring.my_test.triangle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static java.lang.Math.*;

@Component("triangleBean")
public class Triangle {

    private double sideA;

    private double sideB;
    private double sideC;

    @Autowired
    public Triangle(@Value("${triangle.sideA}") double sideA,
                    @Value("${triangle.sideB}") double sideB,
                    @Value("${triangle.sideC}") double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double theoremCos() {
        double angleA = acos((sideB * sideB + sideC * sideC - sideA * sideA)
                / (2 * sideB * sideC));
        return angleA;
    }

//    public double theoremSin() {
//        double angleB = asin(secondSide * sin(angleA) / firstSide);
//        return angleB;
//    }


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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
