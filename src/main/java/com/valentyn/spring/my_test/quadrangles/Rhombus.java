package com.valentyn.spring.my_test.quadrangles;

public class Rhombus extends Parallelogram {

    private double side;

    public Rhombus(double side) {
        super(side, side);
        this.side = side;
        System.out.println("Rhombus is special parallelogram!");
    }

    private double getSide() {
        return side;
    }

    @Override
    public void showInfoAboutFigure() {
        System.out.println("Rhombus sides = " + side + ";");
    }

    @Override
    public void showMainProperties() {
        super.showMainProperties();
        System.out.println("R1. All sides are equal");
        System.out.println("R2. Diagonals bisect the angles");
        System.out.println("R3. Diagonals bisect each other at right angles.");
    }

    @Override
    public void findAngle(){
        System.out.println("Parallelogram only for now");
    }

    public void setSide(double side) {
        this.side = side;
    }
}
