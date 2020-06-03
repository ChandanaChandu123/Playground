#include<iostream>
using namespace std;
int main()
{
int x,y,r;
  float inter,amt,disc,final;
  std::cin>>x;
  std::cin>>y;
  std::cin>>r;
  inter=(x*y*r)/100;
  amt=inter+x;
  disc=(inter*2)/100;
  final=amt-disc;
  std::cout<<inter<<endl;
  std::cout<<amt<<endl;
  std::cout<<disc<<endl;
  std::cout<<final<<endl;  
  return 0;
}