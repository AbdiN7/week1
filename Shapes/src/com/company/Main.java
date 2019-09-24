package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle myBox = new Rectangle(2,2);
        System.out.println("the Area of the Rectangle is: " +myBox.CalculateArea());
        myBox.Display();

        Circle myCircle = new Circle(5);
        System.out.println("The Area of the Circle is: " + myCircle.CalculateArea());
        myCircle.Display();

        Triangle myTriangle = new Triangle(7, 9);
        System.out.println("The Area of the Triangle is: " + myTriangle.CalculateArea());
        myTriangle.Display();
    }
}
