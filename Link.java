import java.util.LinkedList;
class Link{
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.addFirst("samar");
		list.addLast("singh");
		list.add(1,"bahadur");
		
		//list.pop();pop the element form the stack
		//list.poll();retrieve and remove the head element from the list
		//list.clear(); clear all the entries from the list
		//list.remove(1);removes the element from the specified location
		System.out.println(list.getFirst());
		System.out.println(list.get(1));//return the specified element at that position
		System.out.println(list.getLast());
		/*list.peek();
		System.out.println(list.peek());retrieve but does not remove the first element from the list and print hte first element*/
		/*list.clone();
		System.out.println(list.clone()); make a clone of the data entered*/
		/*list.push("rajput");
		System.out.println("theelements are"+list);pushes the element at the top of the list*/
		
	}
}