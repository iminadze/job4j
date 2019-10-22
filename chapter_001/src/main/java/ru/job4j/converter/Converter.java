package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int inRTE = 140;
        int outRTE = rubleToEuro(inRTE);
        int expectedRTE = 2;
        boolean passedRTE = expectedRTE == outRTE;
        System.out.println("140 rubles are 2 euro. Test result:" +" " + passedRTE );
        int inRTD = 180;
        int outRTD = rubleToDollar(inRTD);
        int expectedRTD = 3;
        boolean passedRTD = expectedRTD == outRTD;
        System.out.println("180 rubles are 3 dollar. Test result:" + " " +  passedRTD);
        int inETR = 5;
        int outETR = euroToRuble(inETR);
        int expectedETR = 350;
        boolean passedETR = expectedETR == outETR;
        System.out.println("5 euro are 350 ruble. Test result:" + " " + passedETR );
        int inDTR = 6;
        int outDTR = dollarToRuble(inDTR);
        int expectedDTR = 360;
        boolean passedDTR = expectedDTR == outDTR;
        System.out.println("6 dollar are 360 ruble. Test result:" +" " + passedDTR );
    }
}
