package com.company;

public class Rectangle implements Shape {
    private int Length;
    private  int Width;

    public Rectangle() {
        System.out.println("No Parameters defined");
    }
    public Rectangle(int L, int W)
    {
        Length = L;
        Width = W;
    }
    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    @java.lang.Override
    public int CalculateArea() {
        int area = Length * Width;
        return area;
    }


    @java.lang.Override
    public void Display() {
        System.out.println("********");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println("********");
    }
}
