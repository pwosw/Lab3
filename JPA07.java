import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 創建 Scanner 物件

        while (true) { // 進入無限迴圈
            System.out.println("Input: "); // 提示用戶輸入
            int m = scn.nextInt(); // 讀取第一個整數 m
            int n = scn.nextInt(); // 讀取第二個整數 n

            if (m == 999) { // 如果用戶輸入 999
                scn.close(); // 關閉 Scanner 物件
                break; // 跳出迴圈
            } else {
                for (int i = n; i >= 1; i--) { // 從 n 開始向下遍歷所有可能的因數
                    if (m % i == 0 && n % i == 0) { // 如果 m 和 n 都能被 i 整除
                        System.out.printf(i + " \n"); // 輸出最大公因數
                        break; // 跳出迴圈
                    }
                }
            }
        }
    }
}
