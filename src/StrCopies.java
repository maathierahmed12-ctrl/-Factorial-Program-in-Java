public class StrCopies {

    public boolean strCopies(String str, String sub, int n) {

        if (n == 0) {
            return true;
        }

        if (str.length() < sub.length()) {
            return false;
        }

        if (str.substring(0, sub.length()).equals(sub)) {

            return strCopies(str.substring(1), sub, n - 1);
        }

        return strCopies(str.substring(1), sub, n);
    }
    public class StrCopiesDemo {

        public static void main(String[] args) {

            StrCopies Copies = new StrCopies();

            System.out.println("strCopies(\"catcowcat\", \"cat\", 2) = "

                    + Copies.strCopies("catcowcat", "cat", 2));

            System.out.println("strCopies(\"catcowcat\", \"cow\", 2) = "

                    + Copies.strCopies("catcowcat", "cow", 2));

            System.out.println("strCopies(\"catcowcat\", \"cow\", 1) = "

                    + Copies.strCopies("catcowcat", "cow", 1));
        }
    }
}
