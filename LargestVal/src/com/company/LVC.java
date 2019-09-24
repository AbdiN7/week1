package com.company;

public class LVC {
    public void largestVal()
    {
        int[][] arr1 = {{1,99}, {3,4}};
        int arrMax = arr1[0][0];
        for (int i =0 ;i < arr1.length; i++){
            for( int j = 0; j < arr1[i].length; j++) {
                int currNum = arr1[i][j];
                if (currNum > arrMax) {
                    arrMax = currNum;
                }

            }
        }
        System.out.println(arrMax);

    }
}
