package bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng 2 chiều và in ra mảng đó
        int[][] arr = get2DArray(20);
        print2DArray(arr);

        // Bước 2: Nhập số cần tìm từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm số trong mảng và in ra các vị trí (nếu có)
        boolean found = searchNumber(arr, target);
        if (!found) {
            System.out.println("Số " + target + " không xuất hiện trong mảng.");
        }
    }

    // Hàm tạo mảng 2 chiều ngẫu nhiên
    public static int[][] get2DArray(int size) {
        int[][] arr = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = random.nextInt(100); // Giả sử phạm vi từ 0 đến 99
            }
        }
        return arr;
    }

    // Hàm in mảng 2 chiều
    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    // Hàm tìm kiếm số trong mảng 2 chiều
    public static boolean searchNumber(int[][] arr, int target) {
        List<Integer> rowIndexes = new ArrayList<>();
        List<Integer> colIndexes = new ArrayList<>();
        boolean found = false;

        // Duyệt qua từng phần tử của mảng 2 chiều
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Nếu phần tử tại vị trí (i, j) bằng số cần tìm
                if (arr[i][j] == target) {
                    rowIndexes.add(i); // Lưu vị trí hàng
                    colIndexes.add(j); // Lưu vị trí cột
                    found = true;
                }
            }
        }

        // In ra các vị trí nếu số được tìm thấy
        if (found) {
            System.out.println("Số " + target + " xuất hiện tại các vị trí:");
            for (int k = 0; k < rowIndexes.size(); k++) {
                System.out.println("(" + rowIndexes.get(k) + ", " + colIndexes.get(k) + ")");
            }
        }

        return found;
    }
}

