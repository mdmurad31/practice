package if_else;

import java.util.Scanner;

public class or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        if(n%5==0 || n%3==0)
            System.out.println("divisible by 5 and 3");
        else
            System.out.println("not divisible to 5 and 3");
    }
    
}
// Take positive integer input and
// tell if it is divisible by 5 or 3.