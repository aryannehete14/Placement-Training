#include <iostream>
using namespace std;

int main() {
    int arr[] = {10, 6, 6, 32, 10, 5, 7, 10, 6, 7};
    int large = 7;
    
    int sum = (large * (large + 1)) / 2; 
    int sum2 = 0;

    for(int i = 0; i < 6; i++){
        sum2 = sum2 + arr[i];
    }
    
    int missing = sum - sum2;

    cout << "The missing number is: " << missing << endl;

    return 0;
}
