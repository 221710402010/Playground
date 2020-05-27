#include<iostream>
using namespace std;
int main()
{
  int a,c;
  cin>>a;
  if(a<=200)
  {
    c=a*0.5;
    cout<<"Rs."<<c;
  }
  else if(a<=400)
  {
    c=a*0.65+100;
    cout<<"Rs."<<c;
  }
  else if(a<=600)
  {
    c=a*0.80+200;
    cout<<"Rs."<<c;
  }
  else
  {
    c=a*1.25+425;
    cout<<"Rs."<<c;
  }
  //Type your code here.
}