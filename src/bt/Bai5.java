package bt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng ngẫu nhiên 20 số tự nhiên đã sắp xếp
        int[] arr = generateSortedArray(20);
        System.out.println("Mảng ngẫu nhiên đã sắp xếp: " + Arrays.toString(arr));

        // Bước 2: Nhập số min và max từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        // Bước 3: Tìm kiếm các số nguyên trong khoảng sử dụng tìm kiếm nhị phân
        int lowerBoundIndex = binarySearch(arr, min);
        int upperBoundIndex = binarySearch(arr, max);

        // Bước 4: In ra số lượng số tìm thấy và chi tiết về các số đó
        int count = upperBoundIndex - lowerBoundIndex - 1;
        System.out.println("Số lượng số nguyên trong khoảng [" + min + ", " + max + "]: " + count);
        System.out.println("Chi tiết:");
        for (int i = lowerBoundIndex + 1; i < upperBoundIndex; i++) {
            System.out.println(arr[i]);
        }
    }

    // Hàm tạo mảng ngẫu nhiên 20 số tự nhiên đã sắp xếp
    public static int[] generateSortedArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Số ngẫu nhiên từ 0 đến 99
        }
        Arrays.sort(arr);
        return arr;
    }

    // Hàm tìm kiếm nhị phân trong mảng
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy
    }
}

