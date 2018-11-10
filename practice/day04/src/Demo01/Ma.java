package Demo01;

import java.sql.SQLOutput;

/*题目六：
        这是经典的"百马百担"问题，有一百匹马，驮一百担货，大马驮3担，中马驮2担，
        两只小马驮1担，问有大，中，小马各几匹？*/
public class Ma {
    public static void main(String[] args) {

        for (int daMa = 0; daMa <= 33; daMa++) {
            for (int zhongMa = 0; zhongMa <= 50; zhongMa++) {
                for (int xiaoMa = 0; xiaoMa <= 100; xiaoMa++) {
                    if (daMa + zhongMa + xiaoMa == 100 && xiaoMa % 2 == 0 && 3 * daMa + 2 * zhongMa + xiaoMa / 2 == 100) {
                        System.out.println("大马" + daMa + "匹\t" + "中马" + zhongMa + "匹\t" + "小马" + xiaoMa + "匹");
                    }
                }

            }
        }
    }
}

        /*int daMa, zhongMa, xiaoMa;
          int cons;
          xiaoMa = 100 - daMa - zhongMa;
               if (xiaoMa % 2 == 0) {
                     cons = daMa * 3 + zhongMa * 2 + xiaoMa / 2;
                     if (cons == 100) {
            System.out.println("大马" + daMa + "匹/t" + "中马" + zhongMa + "匹/t" + "小马" + xiaoMa + "匹/t");*/