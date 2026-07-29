import java.util.*;
public class remove_duplicates_sorted{
    public static int is_removed(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j]; 
            }
        }
        return i+1;
    } 
    public static void main(String[] args){
        int[] arr={0,0,3,3,5,6};
        int result=is_removed(arr);
        System.out.println("After removing the duplicates the array has " + result + " elements");
    }
}
/*output:
After removing the duplicates the array has 4 elements
*/
