//Simple change-maker program using a greedy algorithm

#include <iostream>

using namespace std;

int main ()
{
    //variable declarations
    int c[4] = {25, 10, 5, 1}; //array used to store the cent values of quarters, dimes, nickels, and pennies
    int cents; //the input value for the cents
    int x = 0; //the optimal number of coins that will be needed to give the user's change


    cout<<"Hello, please enter a dollar amount in cents ($1.00 = 100 cents for example)" << endl;
    cin>>cents;

    cout<<endl;

    /*for loop initialized to 0 to execute the first index of array up to the fourth index.
    i will be incremented for every time the cent value is lower than the value associated with the given
    array index at the time of execution*/

    for (int i = 0; i < 4;  i++)
    {
            while (cents >= c[i])
            {
                x += 1;
                cents -= c[i];
            }
    }

    cout << "You need " << x << " coins to obtain what you need" << endl;
    return 0;
}
