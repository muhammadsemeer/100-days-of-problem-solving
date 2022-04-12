/*
    Problem: https://www.hackerrank.com/challenges/plus-minus/problem
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float plus = 0, minus = 0, zero = 0, n = arr.size();
        for (int item: arr) {
            if (item == 0) {
                zero++;
            } else if (item > 0) {
                plus++;
            } else {
                minus++;
            }
        }


        System.out.println(plus / n);
        System.out.println(minus / n);
        System.out.println(zero / n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Limit :");
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        plusMinus(array);
    }
}
