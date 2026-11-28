

/** import java.util.Scanner; */


public class work_2 {

    public static void main(String[] args) {
      /**   Scanner sc = new Scanner(System.in); */
         Rectangle r1 = new Rectangle();
         Rectangle r2 = new Rectangle();
         r1.width = 4;
         r1.heigth = 5;
         r2.width = 3;
         r2.heigth = 8;
       /**   System.out.println("r1_width:");
         int r1_w = sc.nextInt();
         System.out.println("r1_heigth:");
         int r1_h = sc.nextInt();
         System.out.println("r2_width:");
         int r2_w = sc.nextInt();
         System.out.println("r2_heigth:");
         int r2_h = sc.nextInt(); */
         System.out.print("Area:");
         System.out.print(r1.area());
          System.out.print(" ");
         System.out.println(r2.area());
         System.out.print("Perimeter:");
         System.out.print(r1.perimeter());
          System.out.print(" ");
         System.out.println(r2.perimeter());
         double max = Math.max(r1.area(), r2.area());
         System.out.printf("areaMax: %.2f", max);

    }
}

