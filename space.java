class space
{
	public static void main(String args[])
	{
	String str="hello anand  how   are you";
	System.out.println(str.replaceAll("\\s{2,}", " ").trim());
	String dat="02-08-2017";
	System.out.println("month:"+dat.substring(0,2));
	System.out.println("date:"+dat.substring(3,5));
	System.out.println("year:"+dat.substring(6,10));

	}
}