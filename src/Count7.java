public class Count7 {

    public int Count7 (int n) {

        if (n == 0) {
            return 0;

        }
        int lastDigit = n % 10;

        if(lastDigit == 7) {
            return 1 + Count7(n / 10);
        else{

        }
    }
        return Count7(n/10);

    }
    public class Count7Demo{
        public static void main(String[]args){

            Count7 count = new Count7();

            System.out.println("Count7 717 =" + count.Count7(717));
            System.out.println("Count7 7 = "+ count.Count7(7));
            System.out.println("Count7 123 =" + count.Count7(123));

        }
    }
}
