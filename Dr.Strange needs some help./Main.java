#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int m,n,r,d;
  cin>>m>>n>>r;
  d=pow(m,n);
  if(d>=r)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}