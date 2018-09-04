import java.util.function.Consumer;
class Consumer1
{
	static void printmsg(String name)
	{
		System.out.println("Hello "+name);
	}
static void printval(int val)
{
	System.out.println(val);
}	
public static void main(String args[])
{
	Consumer<String> con1=Consumer1::printmsg;
	con1.accept("Samar");
	Consumer<Integer> con2=Consumer1::printval;
	con2.accept(748);
}
}