package algorithm.sort;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2021/2/20 0:42
 */
public class InsertSort extends BaseSort{
    @Override
    void sort(Comparable[] arr) {
      for (int i = 1; i < arr.length; i++) {
          for (int j = i; j > 0 && isLess(arr[j], arr[j-1]); j--) {
              exch(arr, j-1, j);
          }
      }
    }
}
