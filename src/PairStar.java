public class PairStar {
    public String PairStar(String str) {


        if (str.length() == 0 || str.length() == 1) {

            return str;
        }
        if (str.length(0) == str.charAt(1)) {

            return str.charAt(0) + "*" + PairStar(str.substring(1));

        }
        return str.charAt(0) + PairStar(str.substring(1));

    }
    public class PairStarDemo{

        public static void main(String[]args){

            PairStar star = new PairStar();

            System.out.println("pairStar(\"hello\") = "
                    + star.PairStar("hello"));

            System.out.println("pairStar(\"xxyy\") = "
                    + star.PairStar("xxyy"));

            System.out.println("pairStar(\"aaaa\") = "
                    + star.PairStar("aaaa"));
        }
    }
        }




