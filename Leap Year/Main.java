#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  if(num%400==0 && num%4==0)
  {
    printf("LEAP YEAR");
  }
  else
  {
    printf("NOT LEAP YEAR");
  }
  return 0;
}