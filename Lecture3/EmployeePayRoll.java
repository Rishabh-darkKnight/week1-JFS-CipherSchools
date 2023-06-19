import java.util.Scanner;

public class EmployeePayRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base pay : ");
        int base_pay = sc.nextInt();
        double hra = 0;
        double da = 0;

        if(base_pay >= 5000) {
            hra = 0.1 * base_pay;
            da = 0.2 * base_pay;
        }
        else{
            hra = 0.2 * base_pay;
            da = 0.3 * base_pay;
        }
        double gp = (base_pay + hra + da);
        System.out.println("Gross Pay : " + Math.round(gp));
    }
}
