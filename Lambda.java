class Lambda
{
interface Greeting{
void show(String s);
}
interface Arith
{
int oper(int a,int b);
}
public static void main(String args[])
{
	Greeting g=(s)->System.out.print("hello everyone\n"+s);
	g.show("lets do operation\n\n");
	Arith add=(int a,int b)->a+b;
	Arith sub=(a,b)->a-b;
	Arith mul=(int a,int b)->{return a*b;};
	Arith div=(int a,int b)->{a=a+b;return a/b;};
	System.out.println("100+10="+add.oper(100,10));
	System.out.println("100-10="+sub.oper(100,10));
	System.out.println("100*10="+mul.oper(100,10));
	System.out.println("100/10="+div.oper(100,10));
}
}