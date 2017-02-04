// Abhinav Bassi
// 31327046
// CS 241 102
// Project 1

public class CS241Project1 {

    public static void main(String[] args) {
        int loops=50;
        long totalstart = System.nanoTime();
        for (int i=0; i<=loops; i++) {
            long start = System.nanoTime();
            long answer = fibonacci(i);
            long end = System.nanoTime();
            System.out.println(i + ": " + answer + " (" + (end-start) + " nanoseconds)");
        }
        long totalend = System.nanoTime();
        System.out.println();
        System.out.println("Total elapsed time: " + (totalend-totalstart) + " nanoseconds");
        System.out.println();
        System.out.println("This function has a time function of O(2^n)");
        System.out.println("F(n) = F(n-1) + F(n-2)");
        System.out.println("Assumming F(n-1) = O(2^n-1)");
        System.out.println("F(n) = F(n-1) + F(n-2) + O(1)");
        System.out.println("F(n) = O(2^n-1) + O(2^n-2) + O(1) = O(2^n)");        
    }
    
    public static long fibonacci(int number) {
        if (number==0) {
            return 0;
        }
        else if (number==1) {
            return 1;
        }
        else {
            return fibonacci(number-1) + fibonacci(number-2);
        }
    }
}
