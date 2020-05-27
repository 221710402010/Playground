#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i,x,y,j,k,l,m;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  x=(a*b)/100;
  y=(a-x)+c;
  j=(d*e)/100;
  k=(d-j)+f;
  l=(g*h)/100;
  m=(g-l)+i;
  cout<<"In Flipkart Rs."<<y<<"\n";
   cout<<"In Snapdeal Rs."<<k<<"\n";
   cout<<"In Amazon Rs."<<m<<"\n";
  if(y>m)
  {
    if(k>m)
    {
    cout<<"He will prefer Amazon"<<"\n";
    }
  }
  else if(k>y)
  {
    if(m>y)
  {
     cout<<"He will prefer Flipkart";
    }
  }
  else if(y==k){
     cout<<"He will prefer Flipkart";
  }
else{
    cout<<"He will prefer Snapdeal";
}
  //Type your code here.
}