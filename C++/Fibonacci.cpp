#include <iostream>
using namespace std;

int main() {
    int n = 10; 
    int t1 = 0, t2 = 1, nextTerm = 0;

    cout << "Fibonacci Series: ";

    for (int i = 1; i <= n; i++) {
        cout << t1 << " ";
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }

    cout << endl;
    return 0;
}
