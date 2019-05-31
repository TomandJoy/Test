import java.util.Scanner;

/**
 * 从下标p开始的长度为l的子串，要将这个子串反转后插在这个子串原来位置的正后方
 */

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            int n = scanner.nextInt();
            String str1 = change(str,n,scanner);
            System.out.println(str1);
        }
        scanner.close();

    }
    public static String change(String str,int n,Scanner scanner){
        for (int i = 0; i < n; i++) {
            //(p,l)
            int p = scanner.nextInt();
            int l = scanner.nextInt();
            //截取出要插入位置前的子串
            String first = str.substring(0,p+l);
            //截取出要反转的子串
            String mid = str.substring(p,p+l);
            //截取出插入位置后的剩余子串
            String end = str.substring(p+l,str.length());
            //按照first.append(mid.reverse).append(end)进行字符串的拼接
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(first);
            StringBuffer sb = new StringBuffer(mid);
            stringBuffer.append(sb.reverse());
            stringBuffer.append(end);
            str = stringBuffer.toString();

        }
        return str;

    }
}
