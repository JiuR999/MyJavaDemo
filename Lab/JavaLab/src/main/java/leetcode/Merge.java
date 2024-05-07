package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int h = 0;
            int l = 0;

        while(l<n){
                while(h< m &&  nums2[l]>=nums1[h] ){
                    h++;
                }
                if(h == m){
                    for (int i = l; i < n; i++) {
                        nums1[h++] = nums2[i];
                    }
                    break;
                }else {
                    for(int j = nums1.length-1;j>h;j--){
                        nums1[j] = nums1[j-1];
                    }
                    nums1[h] = nums2[l];
                }
            l++;
            }

    }
}
