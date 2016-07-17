package com.lemon.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectSortTest {
	@Test
	public void testSelectSort() {
		int[] a = {28, 16, 32, 12, 60, 2, 5, 72};
		new SelectSort().selectSort(a);
		System.out.println("======选择排序测试======");
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
