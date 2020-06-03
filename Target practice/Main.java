#include <iostream>
using namespace std;
int main(void)
{
int target, score, attempt,sum;
cin>>target;
while(sum<target)
{
cin>>score;
sum=sum+score;
attempt++;
}
cout<<"The number of turns is "<<attempt<<"\n";
}