# include <stdio.h>
# include <string.h>
# include <stdlib.h>
int main()
{
  char text[100],unit[10],rpbs[10],str[10][10];
  int i=0,j=0,k=0,p,s;
  gets(text);
  scanf("%s",unit);
  scanf("%s",rpbs);
  s=strlen(text);
  for(k=0; k<s; k++)
  {
    if(text[k]!=' ')
    {
      str[i][j]=text[k];
      j++;
    }else
    {
      str[i][j]='\0';
      j=0; i++;
    }
  }
  str[i][j]='\0';
  p=i;
  for(i=0; i<=p; i++)
  {
    if(strcmp(str[i],unit)==0)
      strcpy(str[i],rpbs);
    printf("%s ",str[i]);
  }
 	return 0;
}