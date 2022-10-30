//Problem link:  https://leetcode.com/problems/next-greater-element-i/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    map.put(nums1[i],j);
                    break;
                }
            }
        }
        // map.forEach((key, value) -> System.out.println(key + ":" + value));

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int index=map.get(nums1[i]);
                boolean check=false;
                int max=-1;
                for(int j=index+1;j<nums2.length;j++){
                    if(nums2[j]>nums1[i]){
                        max=nums2[j];
                        System.out.println(max);
                        check=true;
                        break;
                    }
                }
                if(check){
                    ans[i]=max;
                }else{
                    ans[i]=max;
                }
                // System.out.println(ans[i]);

            }
        }
        return ans;
    }
}
