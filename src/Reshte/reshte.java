package Reshte;

import java.util.HashMap;
import java.util.Scanner;
public class reshte {
    public static void main(String arges[]) {

        HashMap<String,Integer> bank = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name ="";
        while (true) {
            name = input.next();
            if(name.equals("exit"))
                break;
            bank.put(name,input.nextInt());
                    }
        System.out.println(bank.get(input.next()));

    }
}
