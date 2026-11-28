import java.util.Scanner;

public class work_1 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("P:");
      long P = sc.nextLong();
      System.out.print("huu:");
      int huu = sc.nextInt();
      System.out.printf("sar:");
      int sar = sc.nextInt();
      double r = huu / 1200.0;
      double montlyPayment = P * r * (Math.pow(1+r, sar)) / ((Math.pow(1+r,sar)) - 1 );
      double totalPayment =  (montlyPayment * sar) ;
      double totalIntrest =  (montlyPayment * sar) - P;
       System.out.printf("monthPayment: %,d$", Math.round(montlyPayment));
       System.out.println("");
       System.out.printf("TotalPayment: %,d$", Math.round(totalPayment));
        System.out.println("");
       System.out.printf("totalIntrest: %,d$", Math.round(totalIntrest));
   }    
}
