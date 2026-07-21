import java.util.*;
public class largest_number{
    public static int largest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={2,5,1,3,0};
        int result=largest(arr);
        System.out.println("The largest number is " + result);

    }
}
/*output:
The largest number is 5*/
