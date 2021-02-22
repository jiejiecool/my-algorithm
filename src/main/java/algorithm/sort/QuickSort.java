package algorithm.sort;

public class QuickSort extends BaseSort{
    @Override
    void sort(Comparable[] arr) {
        this.sort(arr, 0, arr.length -1);
    }

    private void sort(Comparable[] arr, int start, int end) {
        if (start >= end) {
            return ;
        }
        int pivot = partition(arr, start, end);
        this.sort(arr, start, pivot -1);
        this.sort(arr, pivot+1, end);
    }

    /**
     * 选取pivot的位置，并且将大于pivot的都放到右边，小于pivot的都放到左边，相等的值不动
     * 此处使用pivot = [start],双指针法去探索数组
     * @param arr
     * @param start
     * @param end
     * @return
     */
    private int partition(Comparable[] arr, int start, int end) {

        Comparable pivotData = arr[start];
        int i = start;
        int j = start;
        while (i <= end) {
            if (arr[i].compareTo(pivotData) < 0) {
                j++;
                exch(arr, i, j);
            }
            i++;
        }
        exch(arr, start, j);
        return j;
    }
}
