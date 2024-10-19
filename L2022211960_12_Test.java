import java.util.Scanner;

public class L2022211960_12_Test {
    public static void main(String[] args) {
        System.out.println("输入第一个数字:");
        String num1 =new Scanner(System.in).nextLine();
        System.out.println("输入第二个数字:");
        String num2 =new Scanner(System.in).nextLine();
        Solution solution = new Solution();
        System.out.println(solution.multiply(num1, num2));
    }
}
