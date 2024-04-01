package bt;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng cho sẵn các phần tử (đã sắp xếp tăng dần)
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Bước 2: Nhập số cần tìm từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm nhị phân trong mảng và in ra vị trí nếu có
        int position = binarySearch(arr, target);
        if (position != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + position);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }

    // Hàm tìm kiếm nhị phân trong mảng số nguyên
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
