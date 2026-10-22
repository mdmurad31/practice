package if_else;

import java.util.Scanner;

public class sideoftraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter a value");
        int b = sc.nextInt();
        System.out.println("enter a value");
        int c = sc.nextInt();
        System.out.println("enter a value");

        if (a+b>c && b+c>a && c+a>b )
            System.out.println("valid traingle");
        else
            System.out.println("invalid traingle");
    }

}

// Take 3 positive integers input and
// tell if they can be the sides of a triangle
// or not.