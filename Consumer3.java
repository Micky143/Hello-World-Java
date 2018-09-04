import java.util.function.Consumer;

public class Consumer3
{
    public static void main(String[] args) 
    {
        Consumer<String> con1=(arg)->{System.out.println(arg+" OK");};
        con1.accept("TestConsumerAccept - ");

        Consumer<String> con2=(x)->{System.out.println(x + "OK!!!");};
        con1.andThen(con2).accept("TestConsumerAfterThen - ");
    }
}
