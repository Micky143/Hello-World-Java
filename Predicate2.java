import java.util.function.Predicate;
class Predicate2
{
public static void main(String agrs[])
{
	Predicate<String> predicate=s->{return s.equals("hello");};
	
	Predicate<String> predicateAnd=predicate.and(s->s.length()>4);
	System.out.println(predicateAnd.test("hello"));//AND
	
	Predicate<String> predicateOr=predicate.or(s->s.length()==10);//Or
	System.out.println(predicateOr.test("samar"));
	
	Predicate<String> predicateNegate=predicate.negate();//negate
	System.out.println(predicateNegate.test("payal"));
}
}