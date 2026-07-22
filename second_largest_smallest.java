import java.util.*;
public class second_largest_smallest{
    public static void second(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if((arr[i]>max2)&&(arr[i]!=max)){
                max2=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min2=min;
                min=arr[i];
            }else if((arr[i]<min2)&&(arr[i]!=min)){
                min2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE){
            System.out.println("Second largest not found");
        }else{
            System.out.println("Second largest : " + max2);
        }
        if(min2==Integer.MAX_VALUE){
            System.out.println("Second Smallest not found");
        }else{
            System.out.println("Second smallest : " + min2);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,4,7,7,5};
        second(arr);
    }
}
/*output:
Second largest : 5
Second smallest : 2*/
