package test2;
import java.util.Scanner;

public class test2 {

    private static final int NumberOfInputs = 5;

    public static void main(String args[]) {
        int a[] = new int[NumberOfInputs] , i=0;
        Scanner input = new Scanner(System.in);
        for (i= 0; i < a.length; i++) {
            int x = input.nextInt();
            a[i] = x;
        }
        for (i = a.length-1; i >=0; i--) {
            a[i]+= input.nextInt();
        }
        for (int mehdi: a) {
            System.out.println(mehdi );
        }

    }
    }
