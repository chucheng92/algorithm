package com.rannn.sort;

import java.util.Arrays;

/**
 * Created by Lemonjing on 2015/4/18.
 * Github: Lemonjing
 * 折半查找
 */
public class HalfSearch {
    public int halfSearch(int[] a, int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < a[mid]) {
                high = mid - 1;
            } else if (x > a[mid]) {
                low = mid + 1;
            } else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.binarySearch(a, 5));
        System.out.println(new HalfSearch().halfSearch(a, 0, a.length - 1, 5));
    }
}
