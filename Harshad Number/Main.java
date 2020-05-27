#include<iostream>
using namespace std;
int main()
{
  int n,h,s=0,k;
  cin>>n;
 k=n;
  while(n!=0)
  {
    h=n%10;
    s=s+h;
    n=n/10;
  }
  if(k%s==0)
  {
    cout<<"Harshad Number";
  }
 if(k%s!=0)
  {
    cout<<"Not Harshad Number";
  }
  
  //Type your code here.
}