import java.util.*;
public class sorted_check{
    public static boolean sorted(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args){
        int[] arr={3,4,5,1,2};
        System.out.println(sorted(arr));

    }
}
/*output:
true
  */
