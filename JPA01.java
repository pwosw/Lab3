import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 scn 為輸入清單

        System.out.println("Input: "); // 輸出提示信息

        int total = 0; // 初始化變數 total 作為總和

        int k = scn.nextInt(); // 讀取用戶輸入的整數

        for (int i = 1; i <= k; i++) { // 建立迴圈，從1到 k
            total += i; // 將每個數字加到總和中
        }

        System.out.println("1 + ... + " + k + " = " + total); // 輸出總和結果

        scn.close(); // 關閉 Scanner 物件
    }
}
