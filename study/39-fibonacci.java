package vietjack.algorithms;

import java.util.Scanner;

public class Fibonacci {

	static long[] memoization;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int num = in.nextInt();
		memoization = new long[num + 1];
		long result = findFibonacci(num);
		System.out.print("Fibonacci for number: ");
		System.out.println(num + " = " + result);
	}

	public static long findFibonacci(int num) {

		if (num <= 0) {
			return 0;
		} else {
			long fib = memoization[num];
			if (fib == 0) {
				if (num == 1) {
					memoization[num] = 1;
				} else {
					memoization[num] = findFibonacci(num - 1) + findFibonacci(num - 2);
				}
				fib = memoization[num];
			}
			return fib;
		}
	}
}

//package vietjack.algorithms;
//
//import java.util.Scanner;
//
//public class FibonacciForLoop {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập n = ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		arr[0] = 0;
//		arr[1] = 1;
//		for (int i = 2; i < n; i++) {
//			arr[i] = arr[i - 1] + arr[i - 2];
//		}
//		System.out.println("Mảng Fibonacci với " + n + " phần tử");
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//}
