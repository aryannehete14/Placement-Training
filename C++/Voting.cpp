#include <iostream>
using namespace std;

int main()
{
    int age;

    cout << "Enter age: ";
    cin >> age;

    if (age >= 18)
    {
        cout << "Eligible for voting." << endl;
    }
    else
    {
        cout << "Not Eligible for voting." << endl;
    }

    return 0;
}
