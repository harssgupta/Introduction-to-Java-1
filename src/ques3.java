import java.util.Scanner;
public class ques3 {
    static void area(double r) {
        double formula= Math.PI*r*r;
        System.out.println("Area is: "+formula);
    }
    static void circumference(double r) {
        double formula= 2*Math.PI*r;
        System.out.println("Circumference is: "+formula);
    }
    public static void main(String[] args) {
        System.out.println("*******Menu*********");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3.Exit");
        System.out.println("Choose an option (1-3): ");
        Scanner input= new Scanner(System.in);
        int option= input.nextInt();
        System.out.println("Enter Radius of Circle: ");
        double r= input.nextDouble();
        switch (option) {
            case 1:
                ques3.area(r);
                break;
            case 2:
                ques3.circumference(r);
                break;
            case 3:
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
