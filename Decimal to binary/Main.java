#include <stdio.h>
#include <string.h>
int main()
{
    int num,a[20],i=0,j;
    scanf("%d",&num);
    while(num!=0)
    {
        a[i]=num%2;
        num=num/2;
        i++;
    }
    for(j=i-1;j>=0;j--)
    {
        printf("%d",a[j]);
    }
}
