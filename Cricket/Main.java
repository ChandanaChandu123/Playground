#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int tb,tr,r,b,rem;
float of,to,cr,trr;
std::cin>>tb>>tr>>r>>b;
to=tb/6;
rem=b%6;
of=(b/6)+(rem*0.1);
cr=r/of;
trr=tr/to;
std::cout<<to<<endl;
std::cout<<of<<endl;
std::cout<<fixed<<setprecision(1)<<cr<<endl;
std::cout<<trr<<endl;
if(cr>trr)
  std::cout<<"Eligible to Win";
else  
  std::cout<<"Not Eligible to Win";
return 0;
}