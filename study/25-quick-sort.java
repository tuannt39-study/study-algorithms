package vietjack.algorithms;

//Giải thuật sắp xếp nhanh (Quick Sort)

import java.util.Scanner;

public class QuickSort {
	
	// Giải thuật sắp xếp nhanh (Quick Sort) tăng dần
	static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void quickSortIncreasing(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSortIncreasing(arr, low, pi-1);
            quickSortIncreasing(arr, pi+1, high);
        }
    }
	
	// Giải thuật sắp xếp nhanh (Quick Sort) tăng dần
	static int partitionDecreasing(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] >= pivot)
            {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void quickSortDecreasing(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partitionDecreasing(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSortDecreasing(arr, low, pi-1);
            quickSortDecreasing(arr, pi+1, high);
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

		// Giải thuật sắp xếp nhanh (Quick Sort) tăng dần
		quickSortIncreasing(arr, 0, arr.length-1);
		System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
		printArray(arr);
		
		// Giải thuật sắp xếp nhanh (Quick Sort) giảm dần
		quickSortDecreasing(arr, 0, arr.length-1);
		System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
		printArray(arr);
	}

}
