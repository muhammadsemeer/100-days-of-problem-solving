#include <stdio.h>
#include <string.h>

/*
If the numbers 1 to 5 are written out in words: 
one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 20 inclusive were written out in words, 
how many letters would be used?
*/

const char *convert_to_words(char *num);

void main()
{
    char num[100];
    int i;
    int sum = 0;
    for (i = 1; i <= 20; i++)
    {
        sprintf(num, "%d", i);
        sum += strlen(convert_to_words(num));
    }
    printf("sum = %d\n", sum);
}

const char *convert_to_words(char *num)
{
    char *single[] = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    char *tens[] = {
        "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    char *tens_multiple[] = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    char *tens_power[] = {"hundred", "thousand"};

    int len = strlen(num);
    if (len == 0)
    {
        fprintf(stderr, "empty string\n");
        return "";
    }
    while (*num != '\0')
    {
        if (*num == '1' && len >= 2)
        {
            int sum = *num - '0' + *(num + 1) - '0';
            return tens[sum];
        }
        else if (*num == '2' && *(num + 1) == '0')
        {
            return tens_multiple[2];
        }
        else
        {
            return single[*num - '0'];
        }
            num++;
    }
}