#include <stdio.h>
int main() 
{
	char ch;
  	scanf("%c",&ch);
  	int n=ch;
  	if(n>=65 && n<=90)
    {
      ch=ch+32;
      printf("%c",ch);
    }
  	else if(n>=97 && n<=122)
    {
      ch=ch-32;
      printf("%c",ch);
    }
	return 0;
}