package test3;
import java.util.*;

public class test3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("insert number:");
        int x = input.nextInt(),temp=0 , a[] = {1,2,3,4,5,6};
//        for(int i =0 ; i<x; i++){
//            temp= a[a.length-1];
//            for(int j=a.length-1;j>0;j--)
//            {
//                a[j]= a[j-1];
//            }
//            a[0] =temp;
//        }
        Collections.rotate(Arrays.asList(a), x);

        System.out.println("Modified Array : " +
                Arrays.toString(a));

    }
}