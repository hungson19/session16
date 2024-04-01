package bt;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();

        // Chuyển chuỗi thành mảng ký tự
        char[] charArray = inputString.toCharArray();

        // Sắp xếp mảng ký tự
        Arrays.sort(charArray);

        // Hiển thị chuỗi đã sắp xếp
        String sortedString = new String(charArray);
        System.out.println("Chuỗi đã sắp xếp: " + sortedString);

        scanner.close();
    }
}

