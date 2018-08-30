package Zarb;
import java.util.Scanner;

public class zarb {
    public static void main(String arges[]){
        int i,j, temp =1;
        Scanner input = new Scanner(System.in);
        temp +=  input.nextInt();
         for(i=1;i<temp;i++){
            for(j=1;j<temp;j++)
                System.out.print(i*j);
            System.out.println();


        }
    }

}