#include<iostream>
using namespace std;
int fact(int n)
{
    if(n==0||n==1)
        return 1;
    else
        return(n * fact(n-1));
}
int main()
{
int n,f;
  std::cin>>n;
  f=fact(n);
  std::cout<<"The factorial of"<<" "<<n<<" "<<"is"<<" "<<f;
  return 0;
}