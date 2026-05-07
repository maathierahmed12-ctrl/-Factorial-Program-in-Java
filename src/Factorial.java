public class Factorial {

    public int Factorial(int n) {

        if (n == 1) {

            return 1;

        }
        return n * Factorial(n - 1);
    }

    public class FactorialDemo {

        public static void main(String[] args) {

            Factorial fact = new Factorial();

            System.out.println("Factorial OF 1 = " + fact.Factorial(1));
            System.out.println("Factorial OF 2 = " + fact.Factorial(2));
            System.out.println("Factorial OF 3 = " + fact.Factorial(3));
        }

    }
}