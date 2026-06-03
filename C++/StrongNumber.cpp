#include <iostream>
using namespace std;

int main() {
    int n, temp, d, sum = 0;

    cout << "Enter a number: ";
    cin >> n;

    temp = n; 

    while (n != 0){
        d = n % 10;

        int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact = fact * i;
        }

        sum += fact; 
        n /= 10;   
    }

    if (sum == temp) {
        cout << temp << " is a Strong Number." << endl;
    } else {
        cout << temp << " is NOT a Strong Number." << endl;
    }

    return 0;
}
