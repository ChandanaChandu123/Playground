#include<iostream>
int main()
{
int n,i,value,j,k;
std::cin>>n;
int a[15];
for(i=0;i<n;i++)
{
std::cin>>a[i];
}
std::cin>>k;
for(i=0;i<n;i++)
{
if(a[i]==k)
{
value=1;
break;
}
}
if(value==1)
{
std::cout<<"She passed her exam";
}
else
{
std::cout<<"She failed";
}
return 0;
}