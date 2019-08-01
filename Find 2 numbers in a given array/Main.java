#include<stdio.h>
int main()
{
  	int n,a,b,x=-1,y=-1,i;
  	scanf("%d",&n);
  	int num[n];
  	for(i=0;i<n;i++)
    {
      scanf("%d",&num[i]);
    }
  	scanf("%d%d",&a,&b);
  	for(i=0;i<n;i++)
    {
      if(num[i]==a)
      {
        x=i;
      }
      else if(num[i]==b)
      {
        y=i;
      }
    }
  	printf("Element 1 index = %d\n",x);
  	printf("Element 2 index = %d",y);
}