/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author bonsk5852
 */
public class Recursion {
    // Returns the nth Fibonacci number using a loop
    // n - the nth number we want in the sequence

    public int fibloop(int n) {
        // Array to store sequence
        int[] numbers = new int[n + 1];

        numbers[0] = 1;
        // boundary condition fixing
        if (n > 0) {
            numbers[1] = 1;
        }
        // Building the sequence
        for (int i = 2; i < n + 1; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        // Returning the number
        return numbers[n];
    }

    // Calculate the nth Fib number using resursion
    // n - the nth number we want in the sequence
    public int fibR(int n) {
        // BASE CASE
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibR(n - 1) + fibR(n - 2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Recursion test = new Recursion();

//        int bound1 = test.fibloop(0);
//        System.out.println("0th: " + bound1);
//        
//        int bound2 = test.fibloop(1);
//        System.out.println("1st: " + bound2);
//        
        int norm = test.fibR(26);
        System.out.println("26th: " + norm);


//        for (int i = 0; i <= 26; i++) {
//            int norm = test.fibR(i);
//            System.out.println(i + "th: " + norm);
//        }

    }
}
