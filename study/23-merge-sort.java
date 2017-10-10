package vietjack.algorithms;

//Giải thuật sắp xếp trộn (Merge Sort)

import java.util.Scanner;

public class MergeSort {

	// Giải thuật sắp xếp trộn (Merge Sort) tăng dần
	// Trộn 2 mảng con arr[].
	// Mảng con trái arr[l..m]
	// Mảng con phải arr[m+1..r]
	static void mergeSortIncreasing(int arr[], int l, int m, int r) {
		// Gán kích thước 2 mảng con
		int n1 = m - l + 1;
		int n2 = r - m;
		// Tạo 2 mảng tạm
		int L[] = new int[n1];
		int R[] = new int[n2];
		// Sao chép mảng con vào mảng tạm
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
			for (int j = 0; j < n2; ++j) {
				R[j] = arr[m + 1 + j];
			}
		}
		// Trộn 2 mảng tạm
		// Gán vị trí ban đầu của 2 mảng tạm
		int i = 0, j = 0;
		// Gán vị trí để trộn mảng con
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		// Sao chép các phần tử mảng tạm L[]
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		// Sao chép các phần tử mảng tạm R[]
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Sắp xếp mảng arr[l..r] sử dụng mergeSortIncreasing()
	static void sortIncreasing(int arr[], int l, int r) {
		if (l < r) {
			// Tìm vị trí ở giữa
			int m = (l + r) / 2;
			// Sắp xếp 2 mảng 
			sortIncreasing(arr, l, m);
			sortIncreasing(arr, m + 1, r);
			// Trộn 2 mảng lại
			mergeSortIncreasing(arr, l, m, r);
		}
	}

	// Giải thuật sắp xếp trộn (Merge Sort) giảm dần
	static void sortDecreasing(int[] a){
		int []tempArray = new int[a.length];
		mergeSortDecreasing(a, tempArray,0,a.length-1);
	}

	static void mergeSortDecreasing(int[] a, int []tempArray,int lowerIndex,int upperIndex){
		if(lowerIndex == upperIndex){
			return;
		}else{
			int mid = (lowerIndex+upperIndex)/2;
			mergeSortDecreasing(a, tempArray, lowerIndex, mid);
			mergeSortDecreasing(a, tempArray, mid+1, upperIndex);
			mergeDecreasing(a, tempArray,lowerIndex,mid+1,upperIndex);
		}
	}

	static void mergeDecreasing(int[] a, int[]tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higerIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
		while(lowerIndex <= midIndex && higerIndex <= upperIndex){
			if(a[lowerIndex] > a[higerIndex]){
				tempArray[tempIndex++] = a[lowerIndex++];
			}else{
				tempArray[tempIndex++] = a[higerIndex++];
			}
		}

		while(lowerIndex <= midIndex){
			tempArray[tempIndex++] = a[lowerIndex++];
		}

		while(higerIndex <= upperIndex){
			tempArray[tempIndex++] = a[higerIndex++];
		}

		for(int i=0;i<totalItems;i++){
			a[lowerIndexCursor+i] = tempArray[i];
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
		
		int[] arr = getArray();
		System.out.println("Mảng đã nhập là : ");
		printArray(arr);

		// Giải thuật sắp xếp trộn (Merge Sort) tăng dần
		sortIncreasing(arr, 0, arr.length - 1);
		System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
		printArray(arr);

		// Giải thuật sắp xếp trộn (Merge Sort) giảm dần
		sortDecreasing(arr);
		System.out.println("Mảng sau khi sắp xếp giảm dần là : ");
		printArray(arr);

	}

}
