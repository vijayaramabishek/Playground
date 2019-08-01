#include<stdio.h>
int main()
{
  int i,n,s,res=0;
  scanf("%d",&n);
  int num[n];
  for(i=0;i<n;i++)
  {
    scanf("%d ",&num[i]);
  }
  scanf("%d",&s);
  for(i=0;i<n;i++)
  {
    if(s==num[i])
    {
      res=i+1;
    }
  }
  if(res!=0)
  {
    printf("%d",res);
  }
  else
  {
    printf("%d isn't present in the array.",s);
  }
  return 0;
}