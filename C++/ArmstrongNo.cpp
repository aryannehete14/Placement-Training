#include <iostream>
using namespace std;

int main() {
    int n, d, sum = 0;

    cout << "Enter a number: ";
    cin >> n;

    while (n > 0) {
        d = n % 10;
        int pow = d * d * d;
        sum += pow;
        
        cout << d << "^3 = " << pow << " | Total: " << sum << endl;
        
        n /= 10;
    }

    cout << "Final Sum: " << sum << endl;

    return 0;
}
