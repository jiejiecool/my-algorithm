package algorithm.sort;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2021/2/20 0:53
 */
public class SortTest {
    public static void main(String[] args) {
        Integer[] integers = {4, 756462, 43124, 325, 4363, 54325, 43242, 2, 23243, 54, 6};
        //InsertSort insertSort = new InsertSort();
        QuickSort quickSort = new QuickSort();
        quickSort.sort(integers);
        BaseSort.show(integers);
    }
}
