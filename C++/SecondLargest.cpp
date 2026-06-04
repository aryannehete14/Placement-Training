#include <iostream>
using namespace std;

int main() {
    int arr[10] = {8, 7, 11, 12, 42, 23, 17, 38, 18, 22};
    int largest;
    int second_largest;

    for (int i = 0; i < 10; i++) {
        if(arr[i]>largest){
            second_largest = largest;
            largest = arr[i];
        }else if(arr[i] > second_largest && arr[i] != largest){
            second_largest = arr[i];
            
        }
       
    }
    
    cout<<"Second Largest : "<<second_largest<<endl;


    return 0;
}
