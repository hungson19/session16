package bt;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String sortedSubstring = getSortedSubstring(input);

        System.out.println("Chuỗi kí tự con được sắp xếp: " + sortedSubstring);

        scanner.close();
    }

    public static String getSortedSubstring(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars); // Sắp xếp các kí tự trong chuỗi

        return new String(chars);
    }
}
