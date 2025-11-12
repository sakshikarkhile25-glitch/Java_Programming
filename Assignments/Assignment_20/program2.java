
///////////////////////////////////////////////////////////////
// Function Name : printReverse
// Description   : print numbers from N down to 1 in reverse order
// Input         : Integer
// Output        : Integer
// Author        : Sakshi Damodar Karkhile
// Date          : 30/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void printReverse(int n)
    {
        System.out.println("Numbers from"+n+"down to 1:");

        for(int i = n; i >= n; i--)
        {
            System.out.println(i);
        }
       
       
       }
    }
class program20_2
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
        
    }
}
