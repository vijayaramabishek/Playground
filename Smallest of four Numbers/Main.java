#include<stdio.h>

int main()
{
  int a[4],i,min=999;
  for(i=0;i<4;i++)
  {
   	scanf("%d",&a[i]); 
  }
  for(i=0;i<4;i++)
  { if(min>a[i])
    {
      min=a[i];
    }

  }

  printf("%d",min);
}