package ru.job4j.array;
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int k = 0; k < data.length; k++) {
        int min = MinDiapason.findMin(data, k, data.length - 1);
        int index = FindLoop.indexOf(data, min, k, data.length - 1);
                if (data[k] > min) {
                    int temp = data[k];
                    data[k] = data[index];
                    data[index] = temp;
                }
            }
        return data;
    }
}


