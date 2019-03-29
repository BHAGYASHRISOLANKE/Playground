#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
	for(int curr_row = 1; curr_row <= n; curr_row++)
	{
        // Handle space for each row
	    for(int space = 1; space <= (n - curr_row); space++){
	        printf(" ");
	    }
        // Handle numbers for each row
	    for(int curr_col = 1; curr_col <= 2 * curr_row-1; curr_col++)
	    {
	        printf("*");
        }
      printf("\n");
    }
  return 0;
}