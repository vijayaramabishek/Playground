#include<stdio.h>
int main()
{
  float P,N,R,SI;
  scanf("%f\n%f\n%f",&P,&N,&R);
  SI=(P*N*R)/100;
  printf("%f",SI);
  return 0;
}