package Demo01;

//题目三：
//        计算 1+1/2!+1/3!+1/4!+...1/20!=?
public class JieCheng {
    public static void main(String[] args) {
        double sum =1;
        double num =1;
        double he=0;
        for (int i = 1; i <=20; i++) {
            sum *=i;
            num =1/sum;
            he += num;
        }
        System.out.println(he);
    }
}
