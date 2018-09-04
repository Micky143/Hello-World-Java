import java.util.*;

public class Coll  //iterating collection
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();
	
		list.add("First");
		list.add("Second");
		list.add("Three");

		//Before Java 8: Collection Iteration - enhanced for loop

	/*	for(String str: list)
		{
		System.out.println(str);
		}*/

		//In Java 8: Collection Iteration - lambda expression

		list.forEach(str->System.out.println(str));
	}
}
