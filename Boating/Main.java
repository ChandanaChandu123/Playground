#include<iostream>
using namespace std;
int main()
{
int wt,adult,child,x;
  std::cin>>wt>>adult>>child;
  x=(75*adult)+(30*child);
  if(wt<=x)
  {
    std::cout<<"Boat will drow";
  }
  else
  {
    std::cout<<"Boat is stable";
  }
}