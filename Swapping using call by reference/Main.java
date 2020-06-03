#include<iostream>
int swap(int &a2,int &b2)
{
    int temp;
    temp = a2;
    a2 = b2;
    b2 = temp;
} 
int main() 
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a="<<" "<<a<<" "<<"and b="<<b<<"\n";
  swap(a,b);
  std::cout<<"After swapping a="<<" "<<a<<" "<<"and b="<<b<<"\n";
  return 0;
}