#include<stdio.h>
#include<math.h>
int main()
{
  int n,sum,num,i;
  scanf("%d",&n);
  while(n!=0)
  {
    num=n%10;
    sum=sum+num*pow(2,i);
    n=n/10;
    i++;
  }
  printf("%d",sum);
  return 0;
}