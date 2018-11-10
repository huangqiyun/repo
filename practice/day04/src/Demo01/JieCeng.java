package Demo01;

//   计算5的阶乘 5!的结果是？
public class JieCeng {
    public static void main(String[] args) {
        int sum1 = JieCeng();
        System.out.println(sum1);
    }

    public static int JieCeng() {
        int sum = 1;
        for (int num = 1; num <= 5; num++) {
            sum *= num;
        }
        return sum;
    }
}
