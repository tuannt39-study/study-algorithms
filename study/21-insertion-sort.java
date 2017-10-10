package vietjack.algorithms;

//Giải thuật sắp xếp chèn (Insertion Sort)

import java.util.Scanner;

public class InsertionSort {
	
	// Giải thuật sắp xếp chèn (Insertion Sort) tăng dần
	static void insertionSortIncreasing(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	// Giải thuật sắp xếp chèn (Insertion Sort) giảm dần
	static void insertionSortDecreasing(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
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

		// Giải thuật sắp xếp chèn (Insertion Sort) tăng dần
		insertionSortIncreasing(arr);
		System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
		printArray(arr);
		
		// Giải thuật sắp xếp chèn (Insertion Sort) giảm dần
		insertionSortDecreasing(arr);
		System.out.println("Mảng sau khi sắp xếp giảm dần là : ");
		printArray(arr);
	}
}
