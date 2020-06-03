#include<iostream>
using namespace std;
int main()
{
int x,y;
  cin>>x;
  if(x<=200)
  {
    std::cout<<"Rs."<<(int)(x*0.5);
  }
  else if(x<=400)
  {
    std::cout<<((x*0.65)+100);
  }
  else if(x<=600)
  {
    std::cout<<((x*0.80)+200);
  }
  else if(x>600)
  {
    std::cout<<((x*1.25)+425);
  }
 }