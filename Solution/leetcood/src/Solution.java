import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int []nums = new int[6];
        int target;
        int left,mid = 0,right;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        target = sc.nextInt();
       left = 0;
       right = nums.length-1;
       while (left <= right){
           mid = (left + right)/2;
           if(nums[mid] < target){
               left = mid + 1;
           }else if(nums[mid] > target){
               right = mid - 1;
           }else break;
       }
       if(left > right){
           System.out.println("-1");
       }else {
           System.out.println(mid);
       }
    }
}
