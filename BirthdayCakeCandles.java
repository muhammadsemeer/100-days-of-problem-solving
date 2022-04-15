/*
    Problem: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */

import java.util.*;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = Collections.max(candles), count = 0;
        for (int item: candles) {
            if (item == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Limit :");
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        System.out.println(birthdayCakeCandles(array));
    }
}
