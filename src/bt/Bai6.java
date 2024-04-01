package bt;

import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1, 4}; // Mảng ban đầu

        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(arr));
        insertionSort(arr); // Sắp xếp mảng
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    // Thuật toán sắp xếp chèn
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của mảng đã sắp xếp về phía sau
            // để tạo vị trí thích hợp cho phần tử arr[i]
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Hiển thị mảng sau mỗi bước thực hiện
            System.out.println("Bước " + i + ": " + Arrays.toString(arr));
        }
    }
}
