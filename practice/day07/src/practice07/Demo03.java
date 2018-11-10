package practice07;
/*1.创建一个ArrayList集合，用于存储一些字符串
        2.通过键盘录入5个字符串，保存到集合中
        3.遍历集合，打印每一个字符串*/
import java.util.ArrayList;
import java.util.Scanner;


public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        Scanner two = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        one.add(two.next());
        System.out.println("请输入第二个字符串");
        one.add(two.next());
        System.out.println("请输入第三个字符串");
        one.add(two.next());
        System.out.println("请输入第四个字符串");
        one.add(two.next());
        System.out.println("请输入第五个字符串");
        one.add(two.next());
        for (int i = 0; i < one.size(); i++) {
            System.out.println(one.get(i));
        }
        }
    }

