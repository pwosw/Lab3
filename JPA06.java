import java.util.Scanner;

public class JPA06 {
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
                int Ans = (int) Math.pow(m, n); // 計算 m 的 n 次方
                System.out.println(Ans); // 輸出計算結果
            }
        }
    }
}
