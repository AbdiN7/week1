package com.assgn.signleton;

public class Singleton {
    private Singleton() {
        _oneInstance();
    }

    private static void _oneInstance ()
    {
        System.out.println("Hello");
    }
}


