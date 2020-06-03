#include<iostream>
using namespace std;
int main()
{
float mileage;
int lt,dis,possibledis;
std::cin>>mileage>>lt>>dis;
possibledis=mileage*lt;
if(possibledis>=dis)
{
  std::cout<<"Can reach";
}
  else
  {
   std::cout<<"Cannot reach";
  }
}