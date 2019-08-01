#include <stdio.h>
int main()
{
  float r,angle,result;
  scanf("%f%f",&r,&angle);
  result=2*3.14*r*(angle/360);
  printf("%.2f",result);
}