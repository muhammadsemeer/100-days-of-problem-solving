#include <stdio.h>
/* 
Challenge: We have defined a function named rangeOfNumbers with two parameters. 
The function should return an array of integers which begins with a number represented by 
the startNum parameter and ends with a number represented by the endNum parameter. 
The starting number will always be less than or equal to the ending number.

SHOULD NOT USE ANY KIND OF LOOPS

It should also work for cases where both startNum and endNum are the same.
*/

void range(int start, int end)
{
    if (start > end)
    {
        return;
    }
    printf(" %d ", start);
    range(start + 1, end);
}

void main()
{
    int start, end;
    printf("Enter Start : ");
    scanf("%d", &start);
    printf("Enter End : ");
    scanf("%d", &end);
    printf("[");
    range(start, end);
    printf("]");
    printf("\n");
}