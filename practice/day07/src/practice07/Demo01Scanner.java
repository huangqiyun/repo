package practice07;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int j = scanner.nextInt();
        int result=i+j;
        System.out.println("结果是:"+result);

    }
}
