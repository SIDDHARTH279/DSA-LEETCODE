class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> newArr = new ArrayList<>();

        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                newArr.add(nums1[i]);
                i++;
            } else {
                newArr.add(nums2[j]);
                j++;
            }
        }

        while(i < m) {
            newArr.add(nums1[i]);
            i++;
        }

        while(j < n) {
            newArr.add(nums2[j]);
            j++;
        }

        for(int k = 0; k < newArr.size(); k++) {
            nums1[k] = newArr.get(k);
        }
        


        
    }
}