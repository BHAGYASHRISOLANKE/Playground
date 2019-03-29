#include<stdio.h>
int power(int b,int e);
int main (){
  int b,e;
  scanf("%d%d",&b,&e);
  printf("%d",power(b,e));
  return 0;
}
int power (int b, int e)
{
  int spo=1;
  while(e>=1)
  {
    spo=spo*b;
    e--;
  }
  return spo;
}