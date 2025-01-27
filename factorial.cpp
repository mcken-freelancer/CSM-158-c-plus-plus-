#include <iostream>
using namespace std;

int main()
{
    cout << "Enter a positive number: ";
    int number;
    cin >> number;
    int fact = 1;
    if (number < 0)
    {
        cout << "invalid input";
    }
    else
    {
        for (int i = 1; i <= number; ++i)
        {
            fact *= i;
        }
        cout << "Factorial of " << number << " = " << fact;
    }

    return 0;
}