//HashMap法: TC: O(n), SC: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[] {map.get(target - x), i};
            }
            map.put(x, i); //還沒找到答案, 繼續把array轉map, x:當前的element, i:index
        }
        throw new IllegalArgumentException("No solution!");
    }
}