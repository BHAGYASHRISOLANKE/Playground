#include<stdio.h>
int main()
{
  int a,b,c,num1,num2;
  scanf("%d%d",&num1,&num2);
  if(num1>num2)
  {
    printf("num1 is the greatest");
  }
  else if(num1<num2)
  {
    printf("num2 is the greatest");
  }
  else 
  {
    
      printf("both number equal");
  }
  return 0;
}