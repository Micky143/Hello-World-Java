/*import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;*/
import java.util.concurrent.*;
public class Call
{
  public static void main(String args[]) throws InterruptedException
{
    ExecutorService executor = Executors.newSingleThreadExecutor();
    
Callable c = () -> {
          int n = 0;
          for(int i = 0; i < 100; i++) { n += i; }
          return n;
   
   };

Future<Long> future = executor.submit(c);
    try {
        Long result = future.get(); //waits for the thread to complete
        System.out.println(result);
    } catch (ExecutionException e) {
        e.printStackTrace();
    }
    executor.shutdown();
  }
}

    
