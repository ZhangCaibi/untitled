package SecondLv1;

class PARIS {
    private String CourtNmae;
    private int Plays;
    private int area;
    PARIS(String CourtNmae,int area,int Plays){
        this.CourtNmae = CourtNmae;
        this.Plays = Plays;
        this.area = area;
    }
    void able(){
        System.out.println(CourtNmae+"的面积有"+area+"平方米"+"有"+Plays+"位球员");
    }
}
