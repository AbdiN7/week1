package com.company;

public class ArrowLoop {
    public void printArrowNoSpace() {

        String oneStar = "*";
        String twoStar = "**";
        String threeStar = "***";
        String fourStar = "****";

        String oneStarWSpc = "      *";
        String threeStarWSpc = "     ***";
        String fiveStarWSpc = "    *****";
        String sevenStarWSpc = "   *******";

        String[] arr = {oneStar, twoStar, threeStar, fourStar};
        String[] arr2 = {fourStar, threeStar, twoStar, oneStar};
        String[] arr3 = {oneStarWSpc, threeStarWSpc, fiveStarWSpc, sevenStarWSpc};
        String[] arr4 = {sevenStarWSpc, fiveStarWSpc, threeStarWSpc, oneStarWSpc};
        for (int i = 0; i < arr.length; i++) {
            String currStr = arr[i];
            System.out.println(currStr);
        }
        System.out.println("---------");
        for ( int i = 0; i < arr2.length; i++)
        {
            String currStr = arr2[i];
            System.out.println(currStr);
        }
        System.out.println("----------");
        for (String currStr : arr3) {
            System.out.println(currStr);
        }
        System.out.println("-----------");
        for (String currStr : arr4) {
            System.out.println(currStr);
        }
        System.out.println("------------");
    }
    public void printArrowWithSpace() {




    }
}
