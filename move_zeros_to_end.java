import java.util.*;
public class move_zeros_to_end_optimal{
    public static void zeross(int[] nums){
        int n=nums.length;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int nums[]={3,0,4,5,0,0,8,9,0,1};
        zeross(nums);
        System.out.println(Arrays.toString(nums));
        
    }
}
/*output:
[3, 4, 5, 8, 9, 1, 0, 0, 0, 0]*/
