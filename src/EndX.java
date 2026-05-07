public class endX {

    public String endX(String str) {

        if (str.length() == 0) {
            return "";
        }

        char firstChar = str.charAt(0);

        String rest = endX(str.substring(1));

        if (firstChar == 'x') {
            return rest + "x";
        }

        return firstChar + rest;
    }
    public class EndXDemo{

        public static void main(String[]args){

            endX x = new endX();
            System.out.println("endX(\"xxre\") = " + x.endX("xxre"));
            System.out.println("endX(\"xxhixx\") = " + x.endX("xxhixx"));
            System.out.println("endX(\"xhixhix\") = " + x.endX("xhixhix"));

        }
    }
}
