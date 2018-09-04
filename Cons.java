import java.util.function.Consumer;

public class Cons 
{
    public static void main(String[] args) 
    {
        Consumer < String > consumer1 = (arg) -> { System.out.println(arg + "OK"); };

        consumer1.accept("TestConsumerAccept - ");

        Consumer < String > consumer2 = (x) -> {System.out.println(x + "OK!!!"); };

        consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");
    }
}
