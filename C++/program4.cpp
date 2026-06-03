#include <iostream>
using namespace std;

int main()
{
    char bonus, onsite, promoted;

    cout << "Did employee receive a bonus? (Y/N): ";
    cin >> bonus;

    cout << "Is employee onsite? (Y/N): ";
    cin >> onsite;

    cout << "Is employee promoted? (Y/N): ";
    cin >> promoted;

    if (promoted == 'Y' || promoted == 'y')
    {
        cout << "Not Eligible for Work from Home." << endl;
    }
    else if ((bonus == 'Y' || bonus == 'y') &&
             (onsite == 'Y' || onsite == 'y'))
    {
        cout << "Not Eligible for Work from Home." << endl;
    }
    else if ((bonus == 'Y' || bonus == 'y') &&
             (onsite == 'N' || onsite == 'n'))
    {
        cout << "Eligible for Work from Home." << endl;
    }
    else
    {
        cout << "Eligible for Work from Home." << endl;
    }

    return 0;
}
