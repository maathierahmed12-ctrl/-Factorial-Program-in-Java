public class Array11 {

    public int Array11(int[] nums, int index){

        if (nums[index] == 11){
            return 1+ Array11(nums,index+1);

        }
        return  Array11(nums,index+1);
    }
    public class Array11Demo{

        public static void main(String[]args){

            Array11 arr = new Array11();

            int[] arr1 = {1, 2, 11};
            int[] arr2 = {11, 11};
            int[] arr3 = {1, 2, 3, 4};

            System.out.println("array11([1, 2, 11], 0) = "

                    + arr.Array11(arr1, 0));

            System.out.println("array11([11, 11], 0) = "

                    + arr.Array11(arr2, 0));

            System.out.println("array11([1, 2, 3, 4], 0) = "

                    + arr.Array11(arr3, 0));
        }
    }        }

