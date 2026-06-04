#include <iostream>
using namespace std;

int main() {
    int arr[5] = {2, 3, 4, 8, 9};
    int maxDigit = 0;

    for (int i = 0; i < 5; i++) {
        if (arr[i] > maxDigit) {
            maxDigit = arr[i];
        }
    }

    cout << "Largest 6-digit number: " << maxDigit;
    for (int i = 4; i >= 0; i--) {
        cout << arr[i];
    }
    cout << endl;

    return 0;
}
