package bt;
import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng và nhập giá trị từ người dùng
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(array);

        // Nhập số cần tìm kiếm
        System.out.print("Nhập số cần tìm kiếm: ");
        int value = scanner.nextInt();

        // Tìm kiếm và hiển thị kết quả
        int result = binarySearch(array, 0, n - 1, value);
        if (result == -1) {
            System.out.println("Không tìm thấy " + value + " trong mảng.");
        } else {
            System.out.println(value + " được tìm thấy tại vị trí " + result + " trong mảng.");
        }

        scanner.close();
    }

    // Hàm tìm kiếm nhị phân đệ quy
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = left + (right - left) / 2;

            // Nếu giá trị tại vị trí middle là giá trị cần tìm, trả về vị trí middle
            if (array[middle] == value) {
                return middle;
            }

            // Nếu giá trị cần tìm lớn hơn giá trị tại vị trí middle, tìm kiếm bên phải của mảng
            if (array[middle] < value) {
                return binarySearch(array, middle + 1, right, value);
            }

            // Nếu giá trị cần tìm nhỏ hơn giá trị tại vị trí middle, tìm kiếm bên trái của mảng
            return binarySearch(array, left, middle - 1, value);
        }

        // Trả về -1 nếu không tìm thấy giá trị
        return -1;
    }
}


