import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        Integer[] array = new Integer[100]; // Sử dụng Integer thay vì int để sử dụng generic

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(1000);
        }

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    // Tìm kiếm tuyến tính
    public static <T extends Comparable<T>> int linearSearch(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

    // Tìm kiếm nhị phân không đệ quy
    public static <T extends Comparable<T>> int binarySearchNoRecursive(T[] arr, T value) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid].compareTo(value) > 0) {
                end = mid - 1;
            } else if (arr[mid].compareTo(value) < 0) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Sắp xếp nổi bọt
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        boolean isNextPass = true;
        for (int i = 1; i < arr.length && isNextPass; i++) {
            isNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    isNextPass = true;
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Sắp xếp chọn
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMin = i;
            T valueMin = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(valueMin) < 0) {
                    indexMin = j;
                    valueMin = arr[j];
                }
            }
            arr[indexMin] = arr[i];
            arr[i] = valueMin;
        }
    }

    // Sắp xếp chèn
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T currentValue = arr[i];
            int j;
            for (j = i - 1; j >= 0 && currentValue.compareTo(arr[j]) <= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentValue;
        }
    }
}
