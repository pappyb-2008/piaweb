
import java.util.*;
public class class_work_2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int Dvn = sc.nextInt();
       String m = sc.next();
       String member = m.trim().toUpperCase();
       switch (member) {
        case "GOLD" :{ if(Dvn>=100000){
            double totalSale = Dvn/100*17;
            double totalPay = Dvn - totalSale;
            System.out.println("Sale : 17%(15%+2%)");
           }
           else {
            double totalSale = Dvn/100*15;
            double totalPay = Dvn - totalSale;
            System.out.println("Sale  : 15%");
           } }
            break;
        case "SILVER" :{ if(Dvn>=100000){
            double totalSale = Dvn/100*12;
            double totalPay = Dvn - totalSale;
            System.out.println("Sale : 12%(10%+2%)");
           }
           else {
            double totalSale = Dvn/100*10;
            double totalPay = Dvn - totalSale;
            System.out.println("Sale  : 10%");
           } }
            break;
        case "BRONZE" :{ if(Dvn>=100000){
            double totalSale = Dvn/100*7;
              double totalPay = Dvn - totalSale;
            System.out.print("Sale : 7%(5%+2%)");
           }
           else {
            double totalSale = Dvn/100*5;
            double totalPay = Dvn - totalSale;
            System.out.print("Sale  : 5%");
           } }
            break;
            
            
           default: {
            if(Dvn>=100000) {
                double totalSale = Dvn/100*2;
              double totalPay = Dvn - totalSale;
               System.out.print("Sale : 2%");
            }
           }
       }
       System.out.printf("removed: %,d$%n", Math.round(totalSale));
       System.out.printf("totalPay: %,d$%n", Math.round(totalPay));

   } 
}
