import java.util.Scanner;

/**
 * 在一个网格中，距离不等于2，能放多少个蛋糕
 */

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        //w列数 h行数
        //1 2 行蛋糕的个数
        int a = (h/4)*2 + (h%4<2 ? h%4 :2);
        //3 4行蛋糕的个数
        int b= ((h-2)/4)*2 + ((h-2)%4<2? (h-2)%4 : 2);
        int sum = w/4 *2*(a+b);
        if(w%4>0){
            sum += a;
        }

        if(w%4>1){
            sum +=a;
        }

        if(w%4>2){
            sum +=b;
        }

        System.out.println(sum);
    }
}
