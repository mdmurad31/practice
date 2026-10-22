package pattarn;

import java.util.Scanner;

public class alphabetsquare {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       for (int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.err.print((char)(i+96));
        }
           System.out.println();
       }
    }
}
