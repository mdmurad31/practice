package if_else;

import java.util.Scanner;

public class realnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x>0)
            System.out.println("not a integer");
        else
            System.out.println("it is integer");

    }
    
}
