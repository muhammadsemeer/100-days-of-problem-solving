/*
    Problem : https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

    public static Scanner scanner = new Scanner(System.in);

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0;

        for (long item: ar) {
           result += item;
        }

        return result;
    }

    public static List<Long> getInput(int n) {
        List numbers = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextLong());
        }

        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("Enter Limit");
        int n = scanner.nextInt();
        System.out.println("Enter Numbers");
        List numbers = getInput(n);
        System.out.println("Result is " + aVeryBigSum(numbers));
    }
}
