#include <stdio.h>

/*
CHALLENGE: Build a function that creates histograms. Every bar needs to be on a new line and its length corresponds to the numbers in the array passed as an argument. The second argument of the function represents the character to be used for the bar.

histogram(arr, char)

Examples
—————————
histogram([1, 3, 4], "#") ➞ "#\n###\n####"

#
###
####
*/

void histogram(int arr[], char c) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < arr[i]; j++) {
            printf("%c", c);
        }
        printf("\n");
    }
}

void main() {
    int arr[3] = {1, 3, 4};
    histogram(arr, '#');
    histogram(arr, '=');
    histogram(arr, '-');
}