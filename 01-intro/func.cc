#include <iostream>
#include <array>
#include <functional>
using namespace std;

int main() {
    array<function<int()>,11> funcs;
    for (auto i = 0; i < 11; i++) {
    	funcs[i] = [=]() {return i;};
    }
    for (auto f : funcs) {
    	cout << f() << endl;
    }
}
