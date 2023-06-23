// Activity Statement
// How Long is your BURP ?
//------------------------------------------------------
// you will ask the user to enter his burpLength and produce the appropriate Output:
// eg.
// if the burpLength is
// 5
// output: Burrrrrp
// 25
// output: Burrrrrrrrrrrrrrrrrrrrrrrrrp
// 80
// output: Burrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrp

// note: user can enter any burp length.


import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int burp_len = sc.nextInt();
        System.out.print("Bu");
        for (int i = 1; i <= burp_len; i++) {
            System.out.print('r');
        }
        System.out.print('p');
    }
}
