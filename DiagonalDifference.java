/*
    Problem: https://www.hackerrank.com/challenges/diagonal-difference/problem
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftSum = 0, rightSum = 0, n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    leftSum += arr.get(i).get(j);
                }

                if (i + j == n - 1) {
                    rightSum += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N of Square Matrix");
        int n = scanner.nextInt();
        System.out.println("Enter Matrix of " + n + " x " + n);
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            List list = new ArrayList();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            matrix.add(list);
        }
        int result = diagonalDifference(matrix);
        System.out.println("Result is " + result);
    }
}
