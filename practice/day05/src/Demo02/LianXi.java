package Demo02;

public class LianXi {
    public static void main(String[] args) {
       /* String [] strs= {"一","二","三","四"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }*/
       for(int i = 1;i<=9;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j+"*"+i+"="+i*j+" ");
           }
           System.out.println();
        }
    }
}
