#include <stdio.h>
int main()
{
  	int num,n,f=1,i;
  	scanf("%d%d",&num,&n);
  	if(n>=0)
    {
  		for(i=1;i<=n;i++)
        {
          f=f*num;
        }
      	printf("%d",f);
    }
  	else
    {
      	printf("Wrong input");
    }
    return 0;
}