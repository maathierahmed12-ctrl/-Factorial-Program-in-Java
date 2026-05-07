public class Fibonacci {

    public int Fibonacci(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return  Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    public class FibonacciDemo{

        public static void main(String[]args){

            Fibonacci acc = new Fibonacci();

            System.out.println("Fibonacci 0 =" + acc.Fibonacci(0));
            System.out.println("Fibonacci 1 =" + acc.Fibonacci(1));
            System.out.println("Fibonacci 2 =" + acc.Fibonacci(2));
            System.out.println("Fibonacci 5 =" + acc.Fibonacci(5));
            System.out.println("Fibonacci 10 =" + acc.Fibonacci(10));



        }
    }
}
