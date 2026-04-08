// Q) Payment gateway system and e-commerce website uses 1) UPI payment 2) Card Payment. Both have processPayment() method. A HybridPayment System supports both.
import java.util.*;
interface UPIPayment{
default void processPayment(){
    System.out.println("Payment done using UPI");
}
}
interface CardPayment{
default void processPayment(){
    System.out.println("Payment done using Card");
}
}

class HybridPayment implements UPIPayment,CardPayment{
    Scanner sc = new Scanner(System.in);
    public void processPayment(){
        System.out.println("Choose Payment Method");
        System.out.println("\nChoice1:UPI Payment");
        System.out.println("Choice2:Card Payment");
        System.out.println("\nChoice:");
        int ch = sc.nextInt();
        if(ch==1){
            UPIPayment.super.processPayment();
        }
        else if(ch==2){
            CardPayment.super.processPayment();
        }
        else{
            System.err.println("Invalid Choice");
        }

        
    }
}
public class SIT_102 {
    public static void main(String[] args) {

        HybridPayment op = new HybridPayment();
        while(true){
        op.processPayment();
        }
    }
}
