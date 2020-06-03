#include<iostream>
int main()
{
int r,c;
int m[10][10];
std::cin>>r>>c;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
std::cin>>m[i][j];
}
}
for(int i=0;i<c;i++)
{
for(int j=0;j<r;j++)
{
std::cout<<m[j][i]<<" ";
}
std::cout<<"\n";
}
}