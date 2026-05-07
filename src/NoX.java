public class NoX {

    public String NoX(String str){

        if(str.length()==0){

            return "";
        }

        char firstChar = str.charAt(0);

        String rest = NoX(str.substring(1));
        if (firstChar == 'x') {

            return rest;
        }

        return firstChar + rest;
    }
    public class NoXDemo {

        public static void main(String[] args) {

            NoX remover = new NoX();

            System.out.println("noX(\"xaxb\") = " + remover.NoX("xaxb"));
            System.out.println("noX(\"abc\") = " + remover.NoX("abc"));
            System.out.println("noX(\"xx\") = " + remover.NoX("xx"));
        }
    }
}
