public class StrCount {

    public int StrCount(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.substring(0, sub.length()).equals(sub)) {

            return 1 + StrCount(str.substring(sub.length()), sub);
        }
        return StrCount(str.substring(1), sub);
    }
    public class StrCountDemo{

        public static void main(String[]args){

            StrCount count = new StrCount();

            // Test the method with different substrings
            System.out.println("strCount(\"catcowcat\", \"cat\") = "
                    + count.StrCount("catcowcat", "cat"));

            System.out.println("strCount(\"catcowcat\", \"cow\") = "
                    + count.StrCount("catcowcat", "cow"));

            System.out.println("strCount(\"catcowcat\", \"dog\") = "
                    + count.StrCount("catcowcat", "dog"));
        }
    }
}
