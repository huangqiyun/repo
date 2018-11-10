package Demo01;

public class GetSum {
    public static void main(String[] args) {
        int count = getSum();
        System.out.println(count);
    }

    public static int getSum() {
        int sum = 0;
        for (int s = 1; s <= 100; s++) {
            sum += s;
        }
        return sum;

    }
}
