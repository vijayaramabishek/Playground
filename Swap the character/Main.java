#include<stdio.h>
int main()
{
  int len1,len2,len3,i;
  char str[50],str1[50],str2[50];
  scanf("%s\n%s\n%s",str,str1,str2);
  for(len1=0;str[len1]!='\0';len1++);
  for(len2=0;str1[len2]!='\0';len2++);
  for(len3=0;str2[len3]!='\0';len3++);
  for(i=0;i<len1;i++)
  {
    if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||str[i]=='u'||str[i]=='U')
    {
      str[i]='$';
    }
  }
  for(i=0;i<len2;i++)
  {
    if(str1[i]!='a'&&str1[i]!='A'&&str1[i]!='e'&&str1[i]!='E'&&str1[i]!='i'&&str1[i]!='I'&&str1[i]!='o'&&str1[i]!='O'&&str1[i]!='u'&&str1[i]!='U')
    {
      str1[i]='#';
    }
  }
  for(i=0;i<len3;i++)
  {
    if(str2[i]>=97 && str2[i]<=127)
      str2[i]=str2[i]-32;
  }
  printf("%s",str);
  printf("%s",str1);
  printf("%s",str2);
}