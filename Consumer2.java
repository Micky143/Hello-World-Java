import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class Consumer2
{
	static void addlist(List<Integer> list)
	{
		int result=list.stream()
		.mapToInt(Integer::intValue)
		.sum();
		System.out.println("sum of list values "+result);
	}
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Consumer<List<Integer>> con=Consumer2::addlist;
		con.accept(list);
	}
}
