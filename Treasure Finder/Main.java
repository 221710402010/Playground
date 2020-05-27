#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if((a>b && a<c) || (a>c && a<b ))
  {
    cout<<"The treasure is in box which has number "<<a<<"\n";
  }
  else if((b>a && b<c) || (b>c && b<a))
  {
    cout<<"The treasure is in box which has number "<<b<<"\n";
  }
  else
  {
    cout<<"The treasure is in box which has number "<<c<<"\n";
  }
  if(b%a==0 && c%a==0)
  {
    cout<<"The code to open the box is "<<a<<"\n";
  }
   else if(a%b==0 && c%b==0)
  {
    cout<<"The code to open the box is "<<b<<"\n";
  }
   else if(a%c==0 && b%c==0)
  {
    cout<<"The code to open the box is "<<c<<"\n";
  }
  else
  {
    cout<<"The code to open the box is 1";
  }
  //Type your code here.
}