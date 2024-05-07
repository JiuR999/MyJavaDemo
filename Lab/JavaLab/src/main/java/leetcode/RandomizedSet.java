package leetcode;

import org.example.Intercep;

import java.awt.print.PrinterGraphics;
import java.util.*;

public class RandomizedSet {
    private Map<Integer,Integer> randomMap;
    private List<Integer> nums;
    public RandomizedSet() {
        randomMap = new HashMap<>();
        nums = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(randomMap.containsKey(val)){
            return false;
        }
        nums.add(val);
        randomMap.put(val,nums.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!randomMap.containsKey(val)){
            return false;
        }
        int last = nums.get(nums.size()-1);
        int index = randomMap.get(val);
        nums.set(index,last);
        randomMap.put(last,index);
        nums.remove(nums.size()-1);
        randomMap.remove(val);
        return true;
    }

    public int getRandom() {
        int i = new Random().nextInt(nums.size());
        return nums.get(i);
    }
}
