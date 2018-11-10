package day08;

public class day08Practice {
    public static void main(String[] args) {
        int[] array={1,2,3};
        String result=fromarraytoString( array);
        System.out.println(result);
    }
    public static String fromarraytoString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str +="world"+array[i]+"]";
            }else{
                str +="world"+array[i]+"@";
            }
        }
        return str;

    }
}
