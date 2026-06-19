import java.util.*;

class ZPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        
        //best practice 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || i + j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        /*
            //The 1st line 
            for(int i=0;i<n;i++)
                System.out.print("*");

            System.out.println();

            //the reverse principle matrix line
            for(int i=1;i<n-1;i++){
                for(int j=0;j<n;j++){
                    if(j==n-i-1)
                        System.out.print("*");
                    else 
                        System.out.print(" ");
                }
                System.out.println();
            }

            //The last line
            for(int i=0;i<n;i++)
                System.out.print("*");
        */
    }
}