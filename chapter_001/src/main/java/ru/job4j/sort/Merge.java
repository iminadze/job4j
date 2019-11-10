package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int lind = 0;
        int rind = 0;
        int rslind = 0;
        while (lind < left.length && rind < right.length) {
            if (left[lind] < right[rind]) {
                rsl[rslind] = left[lind];
                lind++;
            }
            else {
                rsl[rslind] = right[rind];
                rind++;
            }
            rslind++;
        }
        while (lind < left.length) {
            rsl[rslind] = left[lind];
            rslind++;
            lind++;
        }
        while (rind < right.length) {
            rsl[rslind] = right[rind];
            rslind++;
            rind++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
