package leetcode;

import org.example.Intercep;
import org.example.Main;

import java.util.HashMap;
import java.util.Map;

public class removeElemrnt {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int cnt = map.get(nums[i]);
                map.put(nums[i],cnt+1);
            } else {
                map.put(nums[i],1);
            }
        }
        int key = nums[0];
        for(Integer k : map.keySet()){
            if(map.get(k)>map.get(key)){
                key = k;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] n = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        removeElemrnt removeElemrnt = new removeElemrnt();
        removeElemrnt.removeDuplicates(n);
    }
}
