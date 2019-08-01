#include<stdio.h>
int main()
{
	int a=0,d,num,t_s1,t_s2,result;
  	scanf("%d",&num);
  	if(num%2==1)
    {
      d=1;
      t_s1=(num+1)/2;
      result=(a+(t_s1-1)*d)*2;
      printf("%d",result);
    }
  	else
    {
      d=2;
      t_s2=num/2;
      result=(a+(t_s2-1)*d)/2;
      printf("%d",result);
    }
}