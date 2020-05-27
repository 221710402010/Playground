#include<iostream>
using namespace std;
int main()
{
  int n,k,c,i,s=0;
  cin>>n>>k;
  c=n+k;
  for(i=1;i<c;i++)
  {
    if(c%i==0)
    {
      s=s+i;
    }
  }
      if(s==c)
      {
        cout<<"They can read the message";
      }
      else
      {
        cout<<"They can't read the message";
      }
}