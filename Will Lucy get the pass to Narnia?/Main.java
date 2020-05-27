#include<iostream>
using namespace std;
int main()
{
  int a,b,c,p;
  cout<<"Enter first number : Enter second number : Menu"<<"\n"
"1.Addition"<<"\n"
"2.Subtraction"<<"\n"
"3.Multiplication"<<"\n"
"4.Division"<<"\n"
"5.Remainder"<<"\n";
  cin>>a>>b>>p;
  switch(p)
  {
    case 1:c=a+b;
      cout<<c;
      break;
    case 2:c=a-b;
      cout<<c;
      break;
    case 3:c=a*b;
      cout<<c;
      break;
    case 4:c=a/b;
      cout<<c;
      break;
    case 5:c=a%b;
      cout<<c;
      break;
    case 6:cout<<"Invalid operation";
      break;
  }
  
}