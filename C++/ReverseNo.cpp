#include <iostream>
using namespace std;

int main(){
    long long num, reverse = 0; 
    cout << "Enter a Number : ";
    cin >> num;
    
    while (num > 0) {
        int d1 = num % 10;
        num = num / 10;
        reverse = reverse * 10 + d1;
    }
    
    cout << "Reversed Number: " << reverse << endl;
    
    return 0;
}
