package com.company;

public class Circle implements Shape {
    int radius;

    public Circle()
    {
        System.out.println("No parameters have been set");
    }
    public Circle(int r)
    {

        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public int CalculateArea() {
        int area = (radius * radius);

        area = area *3;
        return area;
    }

    @Override
    public void Display() {
        System.out.println("   *  *   ");
        System.out.println(" *      *   ");
        System.out.println(" *       *   ");
        System.out.println("  *     *   ");
        System.out.println("    * *   ");
    }
}
