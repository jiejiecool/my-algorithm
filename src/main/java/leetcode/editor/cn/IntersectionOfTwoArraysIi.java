//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
//
// 
//
// 说明： 
//
// 
// 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。 
// 我们可以不考虑输出结果的顺序。 
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小很多，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 458 👎 0

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysIi{
      public static void main(String[] args) {
           Solution solution = new IntersectionOfTwoArraysIi().new Solution();
          int[] arr1 = new int[]{4,9,5};
          int[] arr2 = new int[]{9,4,9,8,4};
          System.out.println(Arrays.toString( solution.intersect(arr1, arr2)));;
      }

      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] returnArr = new int[Math.min(nums2.length, nums1.length)];
        int k = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : nums1) {
            map.merge(key, 1, Integer::sum);
        }

        for (int key : nums2) {
            if (map.get(key) != null && map.get(key) > 0) {
                returnArr[k++] = key;
                map.put(key, map.get(key) - 1);
            }
        }
        return  Arrays.copyOf(returnArr, k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }