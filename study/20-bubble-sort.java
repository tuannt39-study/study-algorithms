package vietjack.algorithms;

//Giải thuật sắp xếp nổi bọt (Bubble Sort)

import java.util.Scanner;

public class BubbleSort {
	
	// Giải thuật sắp xếp nổi bọt (Bubble Sort) tăng dần
	static void bubbleSortIncreasing(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				// So sánh 2 phần tử cạnh nhau
				if (arr[j] > arr[j + 1]) {
					// Đổi vị trí của chúng
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	// Giải thuật sắp xếp nổi bọt (Bubble Sort) giảm dần
	static void bubbleSortDecreasing(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				// So sánh 2 phần tử cạnh nhau
				if (arr[j] < arr[j + 1]) {
					// Đổi vị trí của chúng
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
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

		// Giải thuật sắp xếp nổi bọt (Bubble Sort) tăng dần
		bubbleSortIncreasing(arr);
		System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
		printArray(arr);
		
		// Giải thuật sắp xếp nổi bọt (Bubble Sort) giảm dần
		bubbleSortDecreasing(arr);
		System.out.println("Mảng sau khi sắp xếp giảm dần là : ");
		printArray(arr);
	}
}
