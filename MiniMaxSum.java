/*
 Problem: https://www.hackerrank.com/challenges/mini-max-sum/problem
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Integer> last_expect = new ArrayList<>(5);
        long[] sums = new long[5];
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                last_expect.add(arr.get(j));
            }
            long sum = 0;
            for (int item : last_expect) {
                sum += item;
            }
            sums[i] = sum;
            last_expect = new ArrayList<>(arr.subList(0, i + 1));
        }
        long temp;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (sums[i] < sums[j]) {
                    temp = sums[i];
                    sums[i] = sums[j];
                    sums[j] = temp;
                }
            }
        }
        System.out.println(sums[0] + " " + sums[4]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> array = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            array.add(scanner.nextInt());
        }
        miniMaxSum(array);
    }
}
