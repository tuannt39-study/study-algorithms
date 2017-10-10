package vietjack.algorithms;

//Giải thuật tìm kiếm tuyến tính (Linear Search)

import java.util.Scanner;

public class LinearSearch {

	// Giải thuật tìm kiếm tuyến tính (Linear Search)
	static int linearSearch(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
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

		// Nhập gía trị cần tìm
		System.out.println("Nhập giá trị cần tìm: ");
		int key = sc.nextInt();

		// Giải thuật tìm kiếm tuyến tính (Linear Search)
		int searchIndex = linearSearch(arr, key);
		if (searchIndex == -1) {
			System.out.println(key + " là giá trị không có trong mảng.");
		} else {
			System.out.println(key + " là giá trị cần tìm ở vị trí " + searchIndex + " của mảng.");
		}
	}
}
