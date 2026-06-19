import java.util.*;

class HPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the m rows and n columsn values");
        int m = sc.nextInt() , n =sc.nextInt();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0 ||j==n-1 || i==(m-1)/2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}