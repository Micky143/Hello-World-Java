import java.util.*;
public class Localee
{
	public static void main(String args[])
	{
	Locale[] loc={new Locale("en","US"),new Locale("es","ES"),new Locale("it","IT")};
	for(int i=0;i<loc.length;i++)
	{
		String disp=loc[i].getDisplayLanguage(loc[i]);
		System.out.println(loc[i].toString() + ":"+disp);
	}
	}
}
