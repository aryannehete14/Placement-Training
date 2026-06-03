#include <iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;
    if(n<=1){
        cout<<n<<" "<<"is Not Prime Number"<<endl;
    }else if(n%2==0|| n%3==0){
        cout<<n<<" "<<"is Not Prime Number"<<endl;
    }else if(n==2||n==3){
        cout<<n<<"is Prime Number"<<endl;
    }else{
        cout<<n<<"is Prime Number";
    }
    return 0;
}
