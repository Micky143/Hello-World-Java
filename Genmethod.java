class Genmethod
{
	public <E> void printvalues(E n[])
	{
		for(int i=0;i<n.length;i++)//for for each loop for(E x:n);
		{
			System.out.println(n[i]);//for foreach loop Ststem.out.println(x);
			}
	}
public static void main(String args[])
{
	Genmethod gen=new Genmethod();
	String name[]={"samar", "rajni","ketan","farha","vishal"};
	Integer num[]={10,20,30,40};
	Character ch[]={'a','b','c'};
	gen.printvalues(name);
	gen.printvalues(num);
	gen.printvalues(ch);
}
	}