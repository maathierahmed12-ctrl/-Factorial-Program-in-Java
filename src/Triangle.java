public class Triangle {

    public int Triangle(int n){

        if(n==0){
            return 0;
        }
        return n+Triangle(n-1);
    }

    public class TriangleDemo{

        public static void main(String[]args){

            Triangle tria = new Triangle();

            System.out.println("Triangle 0 =" + tria.Triangle(0));
            System.out.println("Triangle 1 =" + tria.Triangle(1));
            System.out.println("Triangle 2 =" + tria.Triangle(2));

        }
    }
}
