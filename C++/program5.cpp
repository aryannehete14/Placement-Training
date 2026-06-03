#include <iostream>
using namespace std;

int main(){
    int year;
    cout<<"Enter Year : ";
    cin>>year;
    if(year%400==0){
        cout<<"Leap Year"<<endl;
    }else if(year%4==0 && year%100!=0){
        cout<<"Leap Year"<<endl;
    }else if(year%100==0 && year%400!=0){
        cout<<"No Leap Year"<<endl;
    }else{
        cout<<"No leap Year"<<endl;
    }
    
    return 0;
}
