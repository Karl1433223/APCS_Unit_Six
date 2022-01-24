import java.util.Arrays;

public class Search {

    public static int search(int [] arr, int num ){
        int min = 0;
        int max = arr.length -1;

        while (min <= max){
            int mid = (min +max) / 2;
            if (arr[mid] == num)
                return mid;
            else if (arr[mid] > num)
                max = mid -1;
            else
                min = mid +1 ;

            }
        return -1;
            }
            public static void main(String[] args) {
        int[] testing = {2, 5, 13, 27, 43, 55, 57, 61, 72, 83, 99};
                System.out.println(search(testing,72 ));

    }
}
