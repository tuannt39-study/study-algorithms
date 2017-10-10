package vietjack.algorithms;

import java.util.Scanner;

public class TowerHanoi {

	static int numMoves = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số đĩa = ");
		int numDisks = sc.nextInt();
		solveTowerHanoi(numDisks, "A", "B", "C");
		System.out.println("Number of moves: " + numMoves);
	}

	public static void solveTowerHanoi(int numDisks, String start, String auxiliary, String end) {
		numMoves++;
		if (numDisks == 1) {
			System.out.println(start + " to " + end);
		} else if (numDisks > 1) {
			solveTowerHanoi(numDisks - 1, start, end, auxiliary);
			System.out.println(start + " to " + end);
			solveTowerHanoi(numDisks - 1, auxiliary, start, end);
		} else {
			throw new IllegalArgumentException("Number of disks must be larger than 0!");
		}
	}
}