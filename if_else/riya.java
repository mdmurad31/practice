package if_else;

import java.util.Scanner;

public class riya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%3== 0 && a%5==0){
            System.out.println("rebel kid");
        }
        else if (a%3==0){
            System.out.println("bhanu");
        }
        else if (a%5 == 0 ){
            System.out.println("isha");
        }
            
            

        
        
    }
}
// Take positive integer input and
// print:
// _________ if number is divisible by 5
// _________ if number is divisible by 3
// _________ if number is divisible by 5 & 3 both
// _________ if number is not divisible by 5 or 3
