package algorithm.sort;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2021/2/7 11:52
 */
public abstract class BaseSort {
    static void exch(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    abstract void sort(Comparable[] arr);

    static boolean isLess(Comparable v, Comparable j) {
        return v.compareTo(j) < 0;
    }

    static boolean isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            if (isLess(arr[i], arr[i-1])) {
                return false;
            }
        }
        return true;
    }

    static void show(Comparable[] arr) {
        for (Comparable comparable : arr) {
            System.out.println(comparable);
        }
    }
}
