package practice07;

import java.util.ArrayList;

/*	1.创建一个ArrayList集合，用于存储一些字符串："abc","def","def","ghi","def","hij","jkol"
            2.遍历集合，统计集合中"def"字符串一共出现了多少个
            3.将集合中的所有"def"字符串删除。打印删除后的集合元素*/
public class Demo02Random {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<String>();
        one.add("abc");
        one.add("def");
        one.add("def");
        one.add("ghi");
        one.add("def");
        one.add("hij");
        one.add("jkol");
        int count = 0;
        for (int i = 0; i < one.size(); i++) {
            System.out.println(one.get(i));
            if (one.get(i) == "def") {
                count++;
                one.remove("def");
            }
        }
        System.out.println("def出现了" + count + "次");

        System.out.println(one);
    }
}
