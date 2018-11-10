package Demo01;

/*第二题：分析以下需求并实现
        1.定义方法，求出两个整数的和
        2.调用方法，输出结果*/
public class GetSum01 {
    public static void main(String[] args) {
        int sum = num(2,3);
        System.out.println(sum);
    }
    public static int num(int a,int b){
        return (a+b);
    }
}
