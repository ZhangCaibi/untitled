package firsttry;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class level4s {
    public static void main(String[] args) throws ParseException {
        System.out.print("要将日期转换成时间戳请输入1，相反请输入0  :");
        Scanner j=new Scanner(System.in) ;
        int i=j.nextInt();
        if(i==0)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("请输入时间戳：");
            long timeStamp1=s.nextLong();
            SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String a = sdf1.format(new Date(Long.parseLong(String.valueOf(timeStamp1*1000))));
            System.out.print("该时间戳的日期为:"+a);}
        else
        {
            System.out.print("请输入日期:");
            Scanner a=new Scanner(System.in);
            String res = a.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(res);
            long it = date.getTime();
            String s = String.valueOf(it/1000);
            System.out.println("该日期的时间戳为:"+s);
        }
    }
}