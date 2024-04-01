package bt;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Hiển thị chuỗi con có độ dài lớn nhất được sắp xếp
        String longestSortedSubstring = findLongestSortedSubstring(input);
        System.out.println("Chuỗi con có độ dài lớn nhất được sắp xếp: " + longestSortedSubstring);

        scanner.close();
    }

    // Hàm tìm chuỗi con có độ dài lớn nhất được sắp xếp từ chuỗi đầu vào
    public static String findLongestSortedSubstring(String input) {
        String longestSortedSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) <= input.charAt(i + 1)) {
                currentSubstring += input.charAt(i);
            } else {
                currentSubstring += input.charAt(i);
                if (currentSubstring.length() > longestSortedSubstring.length()) {
                    longestSortedSubstring = currentSubstring;
                }
                currentSubstring = "";
            }
        }

        // Xử lý trường hợp chuỗi kết thúc bằng kí tự cuối cùng của chuỗi
        currentSubstring += input.charAt(input.length() - 1);
        if (currentSubstring.length() > longestSortedSubstring.length()) {
            longestSortedSubstring = currentSubstring;
        }

        return longestSortedSubstring;
    }
}

