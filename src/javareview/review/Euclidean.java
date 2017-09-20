/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author bonsk5852
 */
public class Euclidean {

    /**
     * @param args the command line arguments
     */
//    public int gcd(int a, int b){
//        if(a%b == 0){
//            return b;
//        } else{
//            int q = a/b;
//            int r = a%b;
//            return gcd(q,r);
//        }
//    }
    public int gcd(int a, int b) {
        // swap if a is a lower number
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        // Check if we are done
        if (b == 0) {
            return a;
        } else {
            // find new values for a and b
            int r = a % b;
            // calculate new GCD
            return gcd(b, r);
        }
    }

    public static void main(String[] args) {
        System.out.println("---- GCD Test");
        System.out.println("GCD(1378, 24)");
        Euclidean test = new Euclidean();
        int divisor = test.gcd(1378, 24);
        System.out.println(divisor);

    }
}
