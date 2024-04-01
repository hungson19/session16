package bt;

import java.util.Random;

public class Bai1 {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng số nguyên ngẫu nhiên
        int[] arr = getArr(20);

        // Bước 2: In ra mảng số nguyên
        System.out.println("Mảng số nguyên ngẫu nhiên:");
        printArray(arr);

        // Bước 3: Tìm số lớn nhất trong mảng
        int max = findMax(arr);

        // Bước 4: In số lớn nhất ra màn hình
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    // Hàm tạo mảng số nguyên ngẫu nhiên
    public static int[] getArr(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Giả sử phạm vi từ 0 đến 99
        }
        return arr;
    }

    // Hàm in ra mảng số nguyên
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Hàm tìm số lớn nhất trong mảng
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

