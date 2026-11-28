




public class class_work_1 {
    public static void main(String[] args) {
        String prop = "Болд; 19; 3.65";
        int p1 = prop.indexOf(";");
         int p2 = prop.lastIndexOf(";");
        String name = prop.substring(0,p1);
        String Name = name.trim();
        String  age = prop.substring(p1+1,p2);
        int Age =  Integer.parseInt(age.trim());
        int numbLegth = prop.length();
        String grp = prop.substring(p2+1,numbLegth);
        double Grp =  Double.parseDouble(grp.trim());
        String allow = Grp >= 3.5 ? "Хамрагдана" : "Хамрагдахгүй";
      
     
        System.out.printf("Ner      : %s%n" , Name);
        System.out.printf("NAs      : %d%n" , Age);
        System.out.printf("Grp      : %.2f%n" , Grp);
        System.out.printf("Scholaeship    : %s%n", allow);
     
    }
}
