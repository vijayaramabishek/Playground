#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  int len;
  scanf("%[^\n]s", str);
  len=strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='O'||str[i]=='o'||str[i]=='U'||str[i]=='u')
    {
      continue;
    }
    else
    {
      printf("%c",str[i]);
    }
  }
  return 0;
}