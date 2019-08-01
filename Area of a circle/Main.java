#include<stdio.h>
int main()
{
  int num=0; 
  float result=0,sqr;
  scanf("%d",&num);
  result=(float)num/2;
  sqr=result*result*3.14;
  printf("%.2f",sqr);
  return 0;
}