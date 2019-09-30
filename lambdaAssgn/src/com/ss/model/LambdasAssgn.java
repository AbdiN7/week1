package com.ss.model;

import java.util.Arrays;

public class LambdasAssgn {
    String[] myArr = {"me", "tree", "bee", "glee", "flee", "fee", "zee"};

    public void SortArr()
    {
        Arrays.stream(myArr)
                .sorted()
                .forEach(s -> {
                    System.out.println(myArr[Integer.parseInt(s)]);
                });
    }


}
