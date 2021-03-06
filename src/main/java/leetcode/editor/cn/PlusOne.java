//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 
// 👍 640 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
        int[] arr = new int[]{1,2,3};
        int[] arr1 = new int[]{4,3,2,1};
        int[] arr2 = new int[]{9,9,9};
        System.out.println(Arrays.toString(solution.plusOne(arr)));
        System.out.println(Arrays.toString(solution.plusOne(arr1)));
        System.out.println(Arrays.toString(solution.plusOne(arr2)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            boolean ten = false;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (ten || i == digits.length - 1) {
                    int value = plusOne(digits[i]);
                    ten = value < digits[i];
                    digits[i] = value;
                }
            }

            if (ten) {
                int[] arr = new int[digits.length+1];
                arr[0] = 1;
                System.arraycopy(digits, 0, arr, 1, arr.length - 1);
                return arr;
            } else {
                return digits;
            }
        }

        public int plusOne(int i) {
            return i + 1 >= 10 ? i + 1 - 10 : i + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}