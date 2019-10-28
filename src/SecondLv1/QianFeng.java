package SecondLv1;
 import java.util.*;
class QianFeng extends Player{
    private String name;
    private int number;
    int capability = 80;
    QianFeng(int number, String name){
        this.name = name;
        this.number = number;
    }
    void able()
    {
        Coach ZH = new Coach();
        capability = ZH.trainQian();
        System.out.print("训练后能力值为"+ capability +"的"+number+"号"+name);
        if(capability>=80&&capability<90){
            System.out.println("具有变向过人的能力。");
        }
        else if(capability>=90&&capability<100){
            System.out.println("具有牛尾巴过人的能力。");
        }
        else{
            System.out.println("具有彩虹过人的能力。");
        }
    }
}
