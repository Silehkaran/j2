import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <=6; i++)
            sum +=  input.nextInt();
        System.out.println("Sum is " + sum);

    }

}