package com.rannn.sort;

/**
 * 快速排序 - 不稳定
 * @author 哓哓
 *
 */
public class QuickSort {
	// 固定基准
	public void quickSort(int[] a, int low, int high) {
		if (null == a || a.length < 2) {
			return;
		}
		if (low < high) {
			int mid = partition(a, low, high);
			quickSort(a, low, mid-1);
			quickSort(a, mid+1, high);
		}
	}

	private int partition(int[] a, int low, int high) {
		int pivot = a[low];

		while (low < high) {
			// 注意等于，否则死循环
			while (low < high && a[high] >= pivot) {
				high--;
			}
			a[low] = a[high];
			// 注意等于，否则死循环
			while (low < high && a[low] <= pivot) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = pivot;
		
		return low;
	}
}
