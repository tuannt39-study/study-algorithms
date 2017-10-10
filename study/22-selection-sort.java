package vietjack.algorithms;

//Giải thuật sắp xếp chọn (Selection Sort)

import java.util.Scanner;

public class SelectionSort {

	// Giải thuật sắp xếp chọn (Selection Sort) tăng dần
	static void selectionSortIncreasing(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_idx = i; // Gán chỉ số chứa phần tử nhỏ nhất với i
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j; // Gán chỉ số chứa phần tử nhỏ nhất với j nếu giá trị ở chỉ số j nhỏ hơn giá trị ở chỉ số đã gán i.
				}
			}
			if (min_idx != i) {
				// Đổi giá trị ở chỉ số chứa phần tử nhỏ nhất với giá trị ở chỉ số chứa phần tử i nếu chỉ số thay đổi.
				int tmp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = tmp;
			}
		}
	}

	// Giải thuật sắp xếp chọn (Selection Sort) giảm dần
	static void selectionSortDecreasing(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int max_idx = i; // Gán chỉ số chứa phần tử lớn nhất với i
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[max_idx]) {
					max_idx = j; // Gán chỉ số chứa phần tử lớn nhất với j nếu giá trị ở chỉ số j lớn hơn giá trị ở chỉ số đã gán i.
				}
			}
			if (max_idx != i) {
				// Đổi giá trị ở chỉ số chứa phần tử lớn nhất với giá trị ở chỉ số chứa phần tử i nếu chỉ số thay đổi.
				int tmp = arr[max_idx];
				arr[max_idx] = arr[i];
				arr[i] = tmp;
			}
		}
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
	static void printArray(int[] arr) {
		for (int i : arr) {
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

		// Giải thuật sắp xếp chọn (Selection Sort) tăng dần
		selectionSortIncreasing(arr);
		System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
		printArray(arr);

		// Giải thuật sắp xếp chọn (Selection Sort) giảm dần
		selectionSortDecreasing(arr);
		System.out.println("Mảng sau khi sắp xếp giảm dần là : ");
		printArray(arr);
	}
}
