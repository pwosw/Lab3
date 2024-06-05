import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 創建 Scanner 物件
        int total = 0; // 初始化總費用為0
        int count = 0; // 初始化餐點道數為0

        while (true) { // 進入無限迴圈
            System.out.println("Please enter meal dollars or enter -1 to stop: "); // 提示用戶輸入餐點費用或輸入 -1 停止
            int coin = scn.nextInt(); // 讀取用戶輸入的費用

            if (coin == -1) { // 如果用戶輸入 -1
                System.out.println("餐點總費用:" + total); // 輸出總費用
                double ave = (double) total / count; // 計算平均費用，注意要轉換為 double 類型以獲得精確的結果
                System.out.printf("%d 道餐點平均費用為: %.2f", count, ave); // 輸出平均費用，並設定輸出格式為兩位小數
                scn.close(); // 關閉 Scanner 物件
                break; // 跳出迴圈
            } else {
                total += coin; // 總費用累加
                count += 1; // 餐點道數加1
            }
        }
    }
}
