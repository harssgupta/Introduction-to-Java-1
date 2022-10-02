import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] text= new String[10];
        int a=0;
        for(int i=0;i<text.length;i++)
        {
            System.out.println("Enter the input1 or type XDONE to exit:");
            String temp;
            temp=input.nextLine();
            text[i]=temp;
            a++;
            if(text[i].equals("XDONE"))
                break;
        }
        for(int j=0;j<a-1;j++)
        {
            System.out.println(text[j]);
        }


    }
}