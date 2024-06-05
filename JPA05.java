import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 創建 Scanner 物件

        for (int h = 0; h <= 2; h++) { // 迴圈運行三次
            int total = 1; // 初始化 total 為1，因為階乘的初始值為1

            System.out.println("Please enter one value: "); // 提示用戶輸入一個值
            int n = scn.nextInt(); // 讀取用戶輸入的值

            if (n > 0 && n <= 10) { // 判斷輸入的值是否在範圍內
                for (int i = 1; i <= n; i++) { // 建立迴圈計算階乘
                    total *= i; // 使用迴圈計算階乘
                }
                System.out.printf(n + "! = " + total + "\n"); // 輸出計算結果
            } else { // 如果輸入的值不在範圍內
                System.out.println("Error, the value is out of the range \n"); // 輸出錯誤信息
            }
        }
        scn.close(); // 關閉 Scanner
    }
}
