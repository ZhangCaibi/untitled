package SecondLv1;

public class Main {
    public static void main(String[] args) {
        PARIS paris=new PARIS("王子球场",200,3);
        QianFeng NM = new QianFeng(10,"Neymar");
        HouWei KW=new HouWei(9,"KWNJJ");
        paris.able();
        Player.play();//未创建对象直接(static)对类进行引用。
        NM.capability(10,"Neymar");
        NM.able();
        KW.capability(9,"KWNJJ");
        KW.able();
    }
}
