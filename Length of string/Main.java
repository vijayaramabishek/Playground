#include<stdio.h>
int main()
{
  char str[100];
  int len;
  scanf("%[^\n]",str);
  len=strlen(str);
  printf("%d",len);
  return 0;
}