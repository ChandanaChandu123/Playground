#include<iostream>
using namespace std;
int main()
{
int a,b,c,i,l;
std::cin>>a;
b=121;
c=11;
if(a==1)
{
std::cout<<"121"<<" ";
}
else
{
cout<<"121"<<" ";
for(i=2;i<=a;i++)
{
c=c+4;
l=c*c;
std::cout<<l<<" ";
}
}
}