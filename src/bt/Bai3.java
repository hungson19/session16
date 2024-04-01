package bt;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng cho sẵn các phần tử
        int[] arr = {10, 25, 34, 48, 57, 63, 71, 86, 92, 100};

        // Bước 2: Nhập số cần tìm từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm tuyến tính trong mảng và in ra vị trí nếu có
        int position = linearSearch(arr, target);
        if (position != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + position);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }

    // Hàm tìm kiếm tuyến tính trong mảng số nguyên
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về vị trí nếu tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }
}

