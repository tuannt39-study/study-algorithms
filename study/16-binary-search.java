package vietjack.algorithms;

// Giải thuật tìm kiếm nhị phân (Binary Search)
// Để giải thuật này có thể làm việc một cách chính xác thì tập dữ liệu nên ở trong dạng đã được sắp xếp.

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	// Giải thuật tìm kiếm nhị phân (Binary Search)
	static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];
			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // vị trí cần tìm
		}
		return -(low + 1); // không tìm thấy
	}

	// Nhập mảng
	public static int[] getArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng: ");
		int ptMang = sc.nextInt();
		int[] arr = new int[ptMang];
		System.out.println("Nhập " + ptMang + " phần tử của mảng: ");
		for (int i = 0; i < ptMang; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	// In mảng
	static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// Nhập và in mảng
		Scanner sc = new Scanner(System.in);
		
		int[] arr = getArray();
		System.out.println("Mảng đã nhập là : ");
		printArray(arr);

		// Sắp xếp lại mảng
		System.out.println("Mảng đã sắp xếp là : ");
		Arrays.sort(arr);
		printArray(arr);

		// Nhập gía trị cần tìm
		System.out.println("Nhập giá trị cần tìm: ");
		int key = sc.nextInt();

		// Giải thuật tìm kiếm nhị phân (Binary Search)
		int searchIndex = binarySearch(arr, key);
		if (searchIndex < 0) {
			System.out.println(key + " là giá trị không có trong mảng.");
		} else {
			System.out.println(key + " là giá trị cần tìm ở vị trí " + searchIndex + " của mảng.");
		}
	}
}
