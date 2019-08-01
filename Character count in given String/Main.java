#include<stdio.h>
int main()
{
	char str[21];
  	int len,count=1,i;
  	scanf("%s",str);
  	for(len=0;str[len]!='\0';len++);
    if(len>=20)
    {
       printf("Invalid Input");
    }
  	else
    {
  		for(i=0;i<len;i++)
    	{
      		if(str[i]==str[i+1])
      		{
        		count++;
      		}
      		else
      		{
        		printf("%c%d",str[i],count);
        		count=1;
      		}
    	}
	}
}