#include<iostream>
using namespace std;
int rep(int n)
{
  if(n<10)
    return(n);
  else if (n%9 == 0)
      return 9;
   else
      return (n%9);
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<rep(n);
  return 0;
}