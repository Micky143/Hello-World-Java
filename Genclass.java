class Data <E>
{
	E val;
	
		public void input(E v)
		{
			val=v;
		}
		public E output()
		{
			return(val);
			
		}
	
}
class Genclass 
{
	public static void main(String args[])
	{
		Data <String> d1=new Data <String>();
		d1.input("samar");
		System.out.println(d1.output());
		
		
		Data <Integer> d2=new Data <Integer>();
		d2.input(100);
		System.out.println(d2.output());
		
		
		Data <Character> d3=new Data <Character>();
		d3.input('a');
		System.out.println(d3.output());
	}
}