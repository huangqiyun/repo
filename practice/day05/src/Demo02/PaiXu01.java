package Demo02;

/*public class PaiXu01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 9, 6};
        for (int min = 0, max = array.length-1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}*/
public class PaiXu01 {
    public static void main(String[] args) {
        int[] num01 = {1, 2, 3, 4, 5, 6};
       /* int max = num01[0];
        for (int i = 1; i < num01.length; i++) {
            if (num01[i] > max) {
                max = num01[i];
            }
        }
        System.out.println("最大值:\t" + max);*/
       for(int min=0,max=num01.length-1;min<max;min++,max--){
           int temp=num01[min];
           num01[min]=num01[max];
           num01[max]=temp;
       }
        for (int i = 0; i < num01.length; i++) {
            System.out.print(num01[i]);
        }

    }
}
