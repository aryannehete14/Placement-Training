#include <iostream>
using namespace std;

int main() {
    int n;
    cout<<"Enter the number : "<<endl;
    cin>>n;
    
    int sum = 0;
    int sq = n*n;
    
    while(sq!=0){
        int d = sq%10;
        sum = sum +d;
        sq = sq/10;
    }
    if(sum == n){
        cout<<"Neon Number"<<endl;
    }else{
        cout<<"Not Neon Number"<<endl;
    }
    return 0;
}
