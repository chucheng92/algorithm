package com.lemon.datastructure.jcollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hztaoran on 2016/7/18.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList(10);
        list.add(0,1);
        list.add(1,2);
        System.out.println("yes");

        //System.arrayCopy
        int[] a = {1,2,3,4};
        int[] b = new int[4];
        System.arraycopy(a, 1, a, 1, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
