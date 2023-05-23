// ==> Write a function to print the nth term of the Fibonacci series using recursion.

public class Fibnoacci {
   static int fib_term(int n){
       if(n == 0){
           return 0;
       }
        else if(n == 1){
            return 1;
        }
        else {
            return fib_term(n - 1) + fib_term(n - 2);
        }
    }
    public static void main(String args[]){
        System.out.println(fib_term(7));
    }
}

