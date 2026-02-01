import java.util.Scanner;

class practice{
    public static void main(String[] args) {
        System.out.println("hello world!");
        //percentage formula//
         int om =1000;
         int mm =1100;
        double p =om / mm * 100;
     System.out.println(p);
     //discount formula//
double csp=5000;
double dp=40;
double disc= dp*csp/100;
double dsp= csp - disc;
System.out.println(dsp);
Scanner xyz = new Scanner (System.in);
System.out.println("Enter current selling price");
double csr= xyz.nextDouble();
   if (csr<=0) {
    System.out.println("it can't be negatice.enter again");
    csr= xyz.nextDouble();
    
   }
   System.out.print("enter discounted percentage");
   double dr= xyz.nextDouble();
   if (dr > 0){
    double discount = dr * csr / 100 ;
    double dsr = csr - discount;
    System.out.println(dsr);
   }
   //checking while loop//
int n = 1 ;
while (n<=10){
    n= n + 1 ;
}System.out.println(n);
//sinformulacheck
double r = Math.toRadians(30);
double r2 = 30*Math.PI/180;
System.out.println(Math.sin(r));
System.out.println(Math.sin(r2));
//write a program that takes width and height in inches of the place to be carpeted,the price of the carpet in sqft.
//Last input will  be discount percentage.Your program should print the price of carpet for given area before discount and after,both values//
Scanner sc = new Scanner(System.in);
 System.out.print("Enter width in inches: ");
        double w = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double h = sc.nextDouble();
// Input discount percentage
        System.out.print("Enter your discount percentage: ");
        double disccode = sc.nextDouble();
        // formula is h*w and to convert into sqft is to divide by 144//
         double intosqft = (w * h) / 144.0;

         //we take ratepersqft=200
      double   rpsqft = 200;
// total Price before discount
        double totalPrice1 = intosqft * rpsqft;
        // price after discount
        double totalprice2 = disccode * totalPrice1 / 100;
         double finalPrice = totalprice1 - totalprice2;
         //results
         System.out.println("Area in  inches: " + w*h);
         System.out.println("Area in square feet: " + intosqft);
        System.out.println("Price before discount: Rs " + totalPrice1);
        System.out.println("Discount amount: Rs " + totalprice2);
        System.out.println("Price after discount: Rs " + finalPrice);
}
} 