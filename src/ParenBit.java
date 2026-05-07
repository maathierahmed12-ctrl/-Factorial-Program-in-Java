public class ParenBit {

    public String parenBit(String str) {

        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return str;
        }

        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }

        return parenBit(str.substring(0, str.length() - 1));
    }
    public class ParenBitDemo {

        public static void main(String[] args) {

            ParenBit obj = new ParenBit();

            System.out.println("parenBit(\"xyz(abc)123\") = " + obj.parenBit("xyz(abc)123"));

            System.out.println("parenBit(\"x(hello)\") = " + obj.parenBit("x(hello)"));

            System.out.println("parenBit(\"(xy)1\") = " + obj.parenBit("(xy)1"));
        }
    }
}

