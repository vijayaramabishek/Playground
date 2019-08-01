#include<stdio.h>
#include<math.h>
int main()
{
  int n,sum=0,num,i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    num=n%10;
    sum=sum+num*pow(2,i);
    i++;
    n=n/10;
  }
  int array[100],j=0;
  
  for(i=0;sum!=0;i++)
  {
    array[i]=sum%8;
    sum=sum/8;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",array[j]);
  }
}