#include <iostream>
using namespace std;

int main()
{
    int a, b, c;

    cout << "Enter number a: ";
    cin >> a;

    cout << "Enter number b: ";
    cin >> b;

    cout << "Enter number c: ";
    cin >> c;

    if (a >= b && a >= c)
    {
        cout << "Largest Number is A." << endl;
    }
    else if (b >= a && b >= c)
    {
        cout << "Largest Number is B." << endl;
    }
    else
    {
        cout << "Largest Number is C." << endl;
    }

    return 0;
}
