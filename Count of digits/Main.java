#include<iostream>
int main()
{
int n,i;
std::cin>>n;
 if(n==0)
 {
   i=1;
 }
  while(n>0)
  {
    n=n/10;
    i++;
  }
  std::cout<<i;
 }