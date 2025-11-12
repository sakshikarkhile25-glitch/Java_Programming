
///////////////////////////////////////////////////////////////
// Function Name : displayFactors
// Description   : display all factors of a given number
// Input         : Integer
// Output        : String
// Author        : Sakshi Damodar Karkhile
// Date          : 1/11/2025
///////////////////////////////////////////////////////////////

class Logic
{
    void displayFactors(int num)
    {
        System.out.println("Factors of " + num + " are:");

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
        }

       
    }
}
    
class program21_3
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
        
    }
}
