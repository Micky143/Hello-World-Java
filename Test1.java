

interface Account
{
void deposit(int amount);
}

public class Test1
{
	public static void main(String args[])
	{
		Account ob = (int amount)->	//Lambda Expression
		{
			System.out.println("Amount deposited "+amount);
		}; 

	ob.deposit(1000);
	}
}
