
import java.util.*;
class Collect
{
	public static void main(String args[])
	{
		ArrayList name1= new ArrayList(4);
		name1.add("samar");
		name1.add("Rajni");
		name1.add("ketan");
		name1.add("farha");
		Iterator it=name1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}