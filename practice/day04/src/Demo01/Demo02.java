package Demo01;
//题目一：
//    一张纸的厚度大约是0.08mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）？
public class Demo02 {
    public static void main(String[] args) {
        int getCount = cishu();
        System.out.println(getCount);
    }
    public static int cishu() {
        double high = 0.02;
        double shan = 8848 * 100;
        int cishu = 0;
        while (high <= shan) {
            high *= 2;
            cishu++;
        }
        return cishu;
    }
}

