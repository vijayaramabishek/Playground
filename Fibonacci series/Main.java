#include<stdio.h>
int main()
{
  int num,c,next=0,first=0,second=1;
  scanf("%d",&num);
  for(c=0;c<num;c++)
  { 
    if(c<=1)
    {
      next=c;
    }
    else
    {
      next=first+second;
      first=second;
      second=next;
    }
    printf("%d ",next);
  }
    
  
  return 0;
}