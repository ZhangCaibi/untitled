package SecondLv1;

class HouWei extends Player {
    private String name;
    private int number;
    private int capability = 80;
    HouWei(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public int getCapability() {
        return capability;
    }
    void able(){
        Coach ZH = new Coach();
        capability= ZH.trainHou();
        System.out.print("训练后能力值为"+ capability +"的"+number+"号"+name);
        if(capability>=80&&capability<90){
            System.out.println("防守成功率为30%。");
        }
        else if(capability>=90&&capability<100){
            System.out.println("防守成功率为50%。");
        }
        else{
            System.out.println("防守成功率为70%。");
        }

    }
}
