package if_else;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cp");
        int cp = sc.nextInt();
        System.out.println("enter sp");
        int sp = sc.nextInt();
        if (sp>cp)
            System.out.println("profit "+ (cp*100));
        if(sp<cp)
            System.out.println("loss " + (cp*100));
        if(sp==cp)
            System.out.println("no profit");
        
    }
    
}
//If cost price and selling price of an
// item is input through the keyboard, write a
// program to determine whether the seller
// has made profit or incurred loss or no profit
// no loss. Also determine how much profit he
// made or loss he incurred.