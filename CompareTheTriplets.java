/*
    Problem: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {

    public static List<Integer> getTriplet() {
        Scanner scanner = new Scanner(System.in);
        List triplet = new ArrayList<Integer>(3);

        for (int i = 0; i < 3; i++) {
            triplet.add(scanner.nextInt());
        }

        return triplet;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> results = new ArrayList<Integer>(2);
        results.add(0);
        results.add(0);
        for(int i = 0; i < 3; i++) {
            if(a.get(i) > b.get(i)) {
                int result = results.get(0);
                results.set(0, result + 1);
            } else if(a.get(i) < b.get(i)) {
                int result = results.get(1);
                results.set(1, result + 1);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        List a= new ArrayList<Integer>(3), b = new ArrayList<Integer>(3);;

        System.out.println("Enter alice's rating: ");
        a = getTriplet();
        System.out.println("Enter bob's rating: ");
        b = getTriplet();
        System.out.println("Results " + compareTriplets(a, b));
    }
}
