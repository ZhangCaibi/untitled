package SecondLv1;
import  java.util.*;
class Coach {
    private String name;
    int trainQian(){
        QianFeng NM=new QianFeng(10,"Neymar");
        Scanner s = new Scanner(System.in);
        System.out.println("教练具有训练球员的能力。");
        System.out.print("请输入对前锋训练次数：");
        int trains = s.nextInt();
        for (int i = 0; i < trains; i++) {
            NM.capability++;
        }
        return NM.capability;
    }
    int trainHou() {
        HouWei KW = new HouWei(9, "KWNJJ");
        int capability = KW.getCapability();
        Scanner s = new Scanner(System.in);
        System.out.print("请输入对后卫训练次数：");
        int trains = s.nextInt();
        for (int i = 0; i < trains; i++) {
            capability++;
        }
        return capability;
    }}
