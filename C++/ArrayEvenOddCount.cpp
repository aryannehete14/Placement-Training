#include <iostream>
using namespace std;

int main() {
    int arr[10] = {8, 7, 11, 12, 42, 23, 17, 38, 18, 22};
    int evenCount = 0;
    int oddCount = 0;

    for (int i = 0; i < 10; i++) {
        if (arr[i] % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    cout << "Total Even Numbers: " << evenCount << endl;
    cout << "Total Odd Numbers: " << oddCount << endl;

    return 0;
}
