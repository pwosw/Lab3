public class JPA02 {
    public static void main(String[] args) {
        int count = 0; // 初始化計數器變數 count

        for (int i = 1; i <= 9; i++) { // 第一個迴圈，範圍從1到9
            count += 1; // 將 count 增加1

            for (int k = 1; k <= 2; k++) { // 第二個迴圈，範圍從1到2
                count += 1; // 將 count 再次增加1
            }
        }

        System.out.println("count = " + count); // 輸出 count 的值
    }
}
