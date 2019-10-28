package firsttry;
import java.util.Scanner;
public class level4first {public static void main(String[] args){
    System.out.print("要将日期转换成时间戳请输入1，相反请输入0  :");
    Scanner j=new Scanner(System.in) ;
    int i=j.nextInt();
    if(i==1)
    {Scanner a = new Scanner(System.in);
    System.out.print("请输入日期:");
    int y=a.nextInt();
    int m=a.nextInt();
    int d=a.nextInt();
    int hh=a.nextInt();
    int mm=a.nextInt();
    int ss=a.nextInt();
    long ys1,ys2,ds,hs,mms;
    ys1=((y-1972)/4+1)*31622400;
    int b=(y-1972)/4+1;
    ys2=(y-1972-b+2)*365*24*60*60;
    int date=0;
    switch (m)
    {
        case 12:    date += 30; case 11:    date += 31; case 10:    date += 30;
        case 9:    date += 31; case 8:    date += 31; case 7:    date += 30;
        case 6:    date += 31; case 5:    date += 30; case 4:    date += 31;
        case 3:    if(y%400== 0||y%4 == 0&&y%100!=0){
            date += 29;
        }else{
            date += 28;}
        case 2:    date += 31;
        default:    date=date+d;break;}
    ds=(date-1)*24*60*60;
    hs=hh*60*60;
    mms=mm*60;
    long c=ys1+ys2+ds+hs+mms+ss-8*60*60;
    System.out.println("该日期的时间戳为:"+c);}
    else
    {
        System.out.print("请输入时间戳:");
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long days=a/(24*60*60);
        long years=days/365;
        long y=years+1970;
        long b=(years-2)/4+1;
        long days1=days-years*365-b+1;
        long m,d;
        if(y%400== 0||y%4 == 0&&y%100!=0)
        {
            if(days1<=31){m=1;d=days1;}
            else if(days1<=60){m=2;d=days1-31;} else if(days1<=91){m=3;d=days1-60;}
            else if(days1<=121){m=4;d=days1-91;} else if(days1<=152){m=5;d=days1-121;}
            else if(days1<=182){m=6;d=days1-152;} else if(days1<=213){m=7;d=days1-182;}
            else if(days1<=244){m=8;d=days1-213;} else if(days1<=274){m=9;d=days1-244;}
            else if(days1<=305){m=10;d=days1-274;} else if(days1<=335){m=11;d=days1-305;} else {m=12;d=days1-335;}
        }
        else
        {
            if(days1<=31){m=1;d=days1;}
            else if(days1<=59){m=2;d=days1-31;} else if(days1<=90){m=3;d=days1-59;}
            else if(days1<=120){m=4;d=days1-90;} else if(days1<=151){m=5;d=days1-120;}
            else if(days1<=181){m=6;d=days1-151;} else if(days1<=212){m=7;d=days1-181;}
            else if(days1<=243){m=5;d=days1-212;} else if(days1<=273){m=9;d=days1-243;}
            else if(days1<=304){m=10;d=days1-273;} else if(days1<=334){m=11;d=days1-304;} else {m=12;d=days1-334;}
        }
        long hh,mm,ss;
        long a1;
        a1=a-years*365*24*60*60-(days1+b-1)*24*60*60+8*60*60;
        hh=a1/(60*60);
        mm=(a1-hh*60*60)/60;
        ss=a1-hh*60*60-mm*60;
        System.out.println("该时间戳的日期为:"+y+"年"+m+"月"+d+"日"+hh+"时"+mm+"分"+ss+"秒");
    }
}
}
