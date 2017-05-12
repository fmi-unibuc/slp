#include <iostream>
using namespace std;
int main()  {
  int i = 7;
  cout << i << endl;
  {
     cout << i << endl;
     int i = 13;
     cout << i << endl;
  }
  cout <<i << endl;
}