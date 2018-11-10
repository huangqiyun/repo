package Demo01;
/*第三题：分析以下需求并实现
        1.定义方法，求出两个小数的和
        2.调用方法，输出结果*/
public class GetSum02 {
    public static void main(String[] args) {
        double getSum=sum( 8.6,5.7);
        System.out.println(getSum);
    }
    public static double sum(double a,double b){
        return (a+b);
    }
}
