package com.company;

import java.util.Scanner;

public class IOClass {

    public void Scan()
    {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers to add: ");
        int myScannerLength = myScanner.nextInt();
        int[] myArr = new int[myScannerLength];
        System.out.println("Enter all of the numbers you want to add: ");
        int total = 0;
        for (int i = 0; i < myArr.length; i++)
        {
            myArr[i] = myScanner.nextInt();
            int currNum = myArr[i];
            total = total + currNum;

        }
        System.out.println(total);

    }



}
