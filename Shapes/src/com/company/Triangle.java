package com.company;

public class Triangle implements Shape {
    int base;
    int height;

    public Triangle ()
    {
        System.out.println("no Parameters have been set");
    }
    public Triangle (int b, int h)
    {
        base = b;
        height = h;
    }


    @Override
    public int CalculateArea() {
        int area = ((base * height)/2) ;
        return area;
    }

    @Override
    public void Display() {
        System.out.println("    *   ");
        System.out.println("   * *  ");
        System.out.println("  *   *");
        System.out.println(" * * * * ");
    }
}
