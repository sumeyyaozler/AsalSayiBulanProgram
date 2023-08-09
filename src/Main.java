import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = input.nextInt();
        int i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}