#include<stdio.h>
int main(){
	int n;
	scanf("%d", &n);
	for(int curr_row = 1; curr_row <= n; curr_row++)
	{
        // Handle numbers for each row
	    for(int curr_col = 1; curr_col <= n; curr_col++)
	    {
            // Condition to print numbers
	        if(((curr_row == 1) || (curr_col == 1)) 
	            || ((curr_row  == n) || (curr_col == n)))
	        {
	            printf("*");
	        }
	        else{
	            printf(" ");
	        }
	    }
	    printf("\n");
	}
    return 0;
}