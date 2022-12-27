/*
    Problem: https://www.hackerrank.com/challenges/grading/problem
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<Integer>(grades.size());

        for (int grade: grades) {
            if (grade < 38) {
                finalGrades.add(grade);
            } else {
                int nextMultipleOf5 = (grade - (grade % 5)) + 5;
                if (nextMultipleOf5 - grade < 3) {
                    finalGrades.add(nextMultipleOf5);
                } else {
                    finalGrades.add(grade);
                }
            }
        }


        return finalGrades;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Limit :");
        int n = scanner.nextInt();

        System.out.println("Enter Grades: ");
        List<Integer> grades = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            grades.add(scanner.nextInt());
        }

        List<Integer> finalGrades = gradingStudents(grades);

        for (int grade:finalGrades) {
            System.out.println(grade);
        }
    }
}
