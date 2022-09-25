/*
 Problem: https://www.hackerrank.com/challenges/time-conversion/problem
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class TimeConversion {

    public static Scanner scanner = new Scanner(System.in);

    public static String timeConversion(String s) {

        String[] splittedTime = s.split("AM|PM")[0].toString().split(":");

        if (s.contains("PM") && !splittedTime[0].equals("12")) {
                splittedTime[0] = String.valueOf(Integer.parseInt(splittedTime[0]) + 12);
        }

        if (s.contains("AM") && splittedTime[0].equals("12")) {
            splittedTime[0] = "00";
        }


        return String.join(":", splittedTime);
    }


    public static void main(String[] args) {
        System.out.print("Enter Time in 12 hr format: ");
        String time = scanner.next();
        System.out.println("Converted : " + timeConversion(time));
    }
}
