package firsttry;
import java.util.Arrays;
import java.util.*;
public class test2pro {public static void main(String[] args) {
    System.out.print("请问一共有多少个学妹?");
    Scanner s = new Scanner(System.in);
    int a=s.nextInt();
    int[] xueMei=new int[a];
    if(a%2==0)
    {
        System.out.print("无法找到学妹");
    }
    else {
        System.out.print("请输入学妹号码:");
        for(int i=0;i<=a-1;i++)
        {
            xueMei[i]=s.nextInt();
        }
        Arrays.sort(xueMei);
        System.out.print("本次选择的学妹是:"+xueMei[(a-1)/2]);
    }
}}
