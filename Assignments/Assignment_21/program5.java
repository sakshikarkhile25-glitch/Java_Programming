
///////////////////////////////////////////////////////////////
// Function Name : countFactors
// Description   : print all numbers from 1 to N that are
//                 divisible by both 2 and 3
// Input         : Integer
// Output        : String
// Author        : Sakshi Damodar Karkhile
// Date          : 1/11/2025
///////////////////////////////////////////////////////////////

class Logic
{
    void printDivisibleBy2and3(int n)
    {
       for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0 && i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
        

    
class program21_5
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
        
    }
}
