import java.util.Scanner;

public class fun{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int spaces = n-i-1;

            // for the number of spaces in front of the pattern
            for(int sp = 0 ; sp<spaces ;sp++)
                System.out.print(" ");
            
            // for the number of ( to be printed before the *
            for(int j=0;j<=i;j++)
                System.out.print("(");

            // to print the *
            System.out.print("*");

            // for the number of ) to be printed after the *
            for(int j=0;j<=i;j++)
                System.out.print(")");

            System.out.println();
        }

    }
}