/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author bonsk5852
 */
public class Methods {

    public void helloWorld() {
        System.out.println("Hello world");
    }

    public void helloWorld(String name) {
        System.out.println("Hello " + name);
    }

    public int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create an object to run methods
        Methods test = new Methods();
        test.helloWorld();
        test.helloWorld("Steve");
        int sum = test.sumRange(5, 10);
        System.out.println(sum);
    }
}
