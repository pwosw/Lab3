public class JPA03 {
    public static void main(String[] args) {
        int i, num, sum = 0; // 宣告變數

        System.out.printf("1~1000中的完美數有: "); // 輸出提示信息

        for (num = 1; num <= 1000; num++) { // 建立迴圈，迭代1到1000的每個數字
            sum = 0; // 重置變數

            for (i = 1; i < num; i++) { // 內部迴圈，計算該數的所有因數之和
                if (num % i == 0) { // 判斷 i 是否是 num 的因數
                    sum += i; // 如果是，將其加到 sum 中
                }
            }

            if (sum == num) { // 判斷 sum 是否等於 num，即是否為完美數
                System.out.printf("%d ", num); // 如果是完美數，輸出該數字
            }
        }

        System.out.printf("\n"); // 換行
    }
}
