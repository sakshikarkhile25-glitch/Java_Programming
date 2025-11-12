
///////////////////////////////////////////////////////////////
// Function Name : countFactors
// Description   : count total number of factors of given number
// Input         : Integer
// Output        : String
// Author        : Sakshi Damodar Karkhile
// Date          : 1/11/2025
///////////////////////////////////////////////////////////////

class Logic
{
    void countFactors(int num)
    {
        int count = 0;

        System.out.println("Factors of " + num + " are:");

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal number of factors:" + count);
    }

       
    }

    
class program21_4
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countFactors(12);
        
    }
}
