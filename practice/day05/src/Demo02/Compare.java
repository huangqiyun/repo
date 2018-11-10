package Demo02;

public class Compare {
    public static void main(String[] args) {
        int[] array = {20, 50, 25, 80, 10000, 20000};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max + "是最大值");
    }
}
