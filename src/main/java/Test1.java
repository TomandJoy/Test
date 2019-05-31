import java.util.Scanner;

/**
 * 求n!中0的个数
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = n; i >=5 ; i--) {
            //计算一个整数中5的个数
            int m = i;
            while (m%5==0){
                count++;
                m = m/5;
            }

        }
        System.out.println(count);
    }
}