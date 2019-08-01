#include<stdio.h>
int main()
{
  	int n,res=0,i;
  	scanf("%d",&n);
  	int num[n];
  	for(i=0;i<n;i++)
    {
      scanf("%d ",&num[i]);
    }
  	res=num[0];
  	for(i=0;i<n;i++)
    {
      if(num[i]>res)
      {
        res=num[i];
      }
    }
  	printf("%d",res);
}