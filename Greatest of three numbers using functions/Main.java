#include <stdio.h>
int number(int n1,int n2);
int main() {
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int great=number(n1,n2);
  printf("%d",number(great,n3));
  return 0;
}
int number(int n1,int n2)
{
  int max=0;
  if (n1>n2){
    max=n1;
  }
  else{
    max=n2;
  }
  return max;
}

    
	