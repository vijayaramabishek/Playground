#include<stdio.h>
int main()
{
  int a,b,lcm,temp,i;
  scanf("%d%d",&a,&b);
  for(i=1;i<=a && i<=b;i++)
  {
    if(a%i==0 && b%i==0)
      temp=i;
  }
  lcm=(a*b)/temp;
  printf("%d",lcm);
  return 0;
}