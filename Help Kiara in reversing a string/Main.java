#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i,begin;
  cin.getline(str,100);
  cin.getline(rev,100);
    while (str[count] != '\0')
      count++;

   end = count - 1;

   for (begin = 0; begin < count; begin++) {
      rev[begin] = str[end];
      end--;
   }
  cout<<rev;

//Your code goes here               
    
}