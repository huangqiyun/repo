package Demo01;
  /*  我国古代数学家张邱建在《算经》中出了一道“百钱买百鸡”的问题，
            题意是这样的：5文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只雏鸡。
            现在用100文钱买100只鸡，那么各有公鸡、母鸡、雏鸡多少只？
            请编写程序实现。*/
public class XiaoJi{
    public static void main(String[] args){
        //
        for(int gong=0;gong<=20;gong++){
            for(int mu=0;mu<=33;mu++){
                for(int xiao=0;xiao<=100;xiao++){
                    if(5*gong + 3*mu + xiao/3 == 100 && xiao%3==0 && gong+mu+xiao == 100){
                        System.out.print("公鸡"+gong+"只,");
                        System.out.print("母鸡"+mu+"只,");
                        System.out.println("小鸡"+xiao+"只");
                    }
                }
            }
        }
    }
}