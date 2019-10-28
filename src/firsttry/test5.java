package firsttry;
import java.util.*;
public class test5 {public static void main(String[] args) {
    System.out.print("请输入数据数量：");
    Scanner s = new Scanner(System.in);
    int q=s.nextInt();
    int[] a=new int[q];
    System.out.print("请输入数据:");
    for(int n=0;n<=q-1;n++)
    {
        a[n]=s.nextInt();
    }
    for(int i=0;i<=q-2;i++)
    {
        if(a[i]>a[i+1])
        {
            int c;
            c=a[i+1];
            a[i+1]=a[i];
            a[i]=c;
        }
    }
    for(int j=q-2;j>=0;j--)
    {
        if(a[j+1]<a[j])
        {
            int c;
            c=a[j+1];
            a[j+1]=a[j];
            a[j]=c;
        }
    }
    int m=0;
    for (int b:a) {
        System.out.print(" "+b);
}
}}
