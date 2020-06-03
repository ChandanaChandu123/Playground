#include<iostream>
using namespace std;
int gcd(int a,int b)
{
int small,gcd;
if(a<b)
{
small=a;
}
else  
{
small=b;
}
while(small>=1)
{
if((a%small==0)&&(b%small==0))
{
gcd=small;
break;
}
small--;
}
}
int main()
{
  int a,b,l;
  std::cin>>a>>b;
  l=gcd(a,b);
  std::cout<<"G.C.D of "<<a <<" and "<< b <<" "<< "="<<" "<<l;
  return 0;
}