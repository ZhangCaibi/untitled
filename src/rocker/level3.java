package rocker;
import java.util.Scanner;
public class level3 {
    public static void main(String[] args) {
        System.out.println("欢迎光临红⾼凉餐厅，这是今天的菜品：");
        Menu.tip();
        Menu.order();
        System.out.println("还有需要点的菜么？");
        Scanner s = new Scanner(System.in);
        String r=s.next();
        if (r.equals("yes")) {
            Menu.tip();
            Menu.order();
            Menu.pay();
        }
        else{
            Menu.pay();
        }
    }
}

class Menu {
    private static String[] cai=new String[5];
    static void tip() {
             cai[0] = "糖醋⾥脊 18元";
             cai[1] = "⾲菜炒蛋 12元";
             cai[2] = "⻥⾹⾁丝 15元";
             cai[3] = "⼲锅⼟⾖⽚ 18元";
             cai[4] = "⼲锅千⻚⾖腐 18元";
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+".");
            System.out.println(cai[i]);
        }
    }
    static void order(){
            int[] money = new int[5];
            money[0] = 18;
            money[1] = 12;
            money[2] = 15;
            money[3] = 18;
            money[4] = 18;
        String order = "请输⼊想要点的菜的序号(空格键分割，回⻋结束)";
        System.out.println(order);
            Scanner m = new Scanner(System.in);
            String a = m.nextLine();
            String[] num = a.split(" ");
            int[] result = new int[num.length];
            int sumMoney = 0;
            for (int i = 0; i < result.length; i++) {
                result[i] = Integer.parseInt(num[i]);
                sumMoney += money[result[i]-1];
            }
            System.out.println("你选择了：");
            for (int i = 0; i < result.length; i++) {
                System.out.println((i+1)+"."+cai[result[i]-1]);

            }
            System.out.println("一共"+sumMoney+"元");
        }
        static void pay(){
            String[] payways = new String[3];
            payways[0] = "1. ⼈脸识别";
            payways[1] = "2. ⽀付宝";
            payways[2] = "3. 微信";
            for(String method:payways){
                System.out.println(method);
            }
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();
            if((i-1)==0){
                System.out.println("请看摄像头......");
            }
            else{
                System.out.println("请出示付款码......");
            }
        }
}




