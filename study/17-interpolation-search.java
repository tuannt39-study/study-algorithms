package vietjack.algorithms;

//Giải thuật Tìm kiếm nội suy (Interpolation Search)
//Để giải thuật này có thể làm việc một cách chính xác thì tập dữ liệu nên ở trong dạng đã được sắp xếp.

import java.util.Arrays;

//Giải thuật Tìm kiếm nội suy (Interpolation Search)

import java.util.Scanner;

public class InterpolationSearch {

	// Giải thuật Tìm kiếm nội suy (Interpolation Search)
	static int interpolationSearch(int a[], int key) {
		// Xác định 2 vị trí đầu, cuối mảng
		int low = 0;
		int high = (a.length - 1);
		while (low <= high && key >= a[low] && key <= a[high]) {
			// Ban đầu vị trí dò là tại vị trí nằm giữa mảng
			int pos = low + (((high - low) / (a[high] - a[low])) * (key - a[low]));
			// Tìm thấy dữ liệu
			if (a[pos] == key)
				return pos;
			// Nếu dữ liệu cần tìm lớn hơn giá trị tại vị trí giữa, thì tìm kiếm trong mảng con bên phải
			if (a[pos] < key)
				low = pos + 1;
			// Nếu dữ liệu cần tìm nhỏ hơn giá trị tại vị trí giữa, thì tìm kiếm trong mảng con bên trái
			else
				high = pos - 1;
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

		// Sắp xếp lại mảng
		System.out.println("Mảng đã sắp xếp là : ");
		Arrays.sort(arr);
		printArray(arr);

		// Nhập gía trị cần tìm
		System.out.println("Nhập giá trị cần tìm: ");
		int key = sc.nextInt();

		// Giải thuật Tìm kiếm nội suy (Interpolation Search)
		int searchIndex = interpolationSearch(arr, key);
		if (searchIndex == -1) {
			System.out.println(key + " là giá trị không có trong mảng.");
		} else {
			System.out.println(key + " là giá trị cần tìm ở vị trí " + searchIndex + " của mảng.");
		}
	}
}
