#include<iostream>
using namespace std;
int main()
{
  int n,k,c=0;
  cin>>n;
  do
  {
    k=n%10;
    n=n/10;
    c++;
  }while(n!=0);
  cout<<c;
  // Type your code here
}