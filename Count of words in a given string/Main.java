#include<stdio.h>

int main()
{
 	char str[100];
  	scanf("%[^\n]s",str);
  	int count=1,len;
  	len=strlen(str);
  	for(int i=0;i<len;i++)
    {
      if(str[i]==' ')
      {
        count++;
      }
    }
  	printf("%d",count);
}