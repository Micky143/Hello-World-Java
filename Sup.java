import java.util.function.Supplier; 

public class Sup
{ 
     public static void main(String[] args) 
     { 

     Supplier<String> supplierStr = () -> { return "Hello world."; }; 

     Supplier<Number> supplierNum = () -> { return 40; }; 

     System.out.println(supplierStr.get());               
     
     System.out.println(supplierNum.get()); 

} 
}
