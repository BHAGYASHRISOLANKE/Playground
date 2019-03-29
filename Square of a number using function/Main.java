#include<stdio.h>
int sum_of_natural_numbers(int num);// Function declaration
int main() {
   int n;
   scanf("%d", &n);
   printf("%d", sum_of_natural_numbers(n)); // Function call
  	return 0;
}
int sum_of_natural_numbers(int num){// Function definition
    int spo = 0;
    {
        spo = num * num;
      
    }
    return spo;
}