package chap01;
import java.util.Scanner;

class Max3 {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Input some number.");
        System.out.println("a : "); int a = stdIn.nextInt();
        System.out.println("b : "); int b = stdIn.nextInt();
        System.out.println("c : "); int c = stdIn.nextInt();
        stdIn.close();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("max is : " + max);
    }
}