package Demo01;
/*第四题：分析以下需求并实现
        1.定义方法，求出长方形的周长
        2.调用方法，输出结果*/
public class GetZhouChang {
    public static void main(String[] args) {
        double getZhouChang=zhouChang(10,25.5 );
        System.out.println(getZhouChang);
    }
    public static double zhouChang(double a,double b){
        return (2*(a+b));
    }
}
