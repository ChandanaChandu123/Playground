#include<iostream>
using namespace std;
int main()
{
int a,k;
std::cin>>a;
  std::cout<<a<<"\n";
while(a!=1)
{
  if(a%2==0)
  {
    a=a/2;
    std::cout<<a<<"\n";
    k++;
  }
  else
  {
    a=(3*a)+1;
    std::cout<<a<<"\n";
    k++;
  }
}
  std::cout<<k;
  return 0;
}