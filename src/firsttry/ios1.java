package firsttry;
import java.util.*;
public class  ios1 {public static void main(String[] args){
    System.out.print("请输入一个整数:");
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    for(int c=n;c>=1;c--)
    {
        for(int b=c-1;b>=1;b--)
        {
            System.out.print(" ");
        }
        for(int i=1;i<=n-c+1;i++)
        {
            System.out.print(i);
        }
        for(int j=n-c;j>=1;j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
}
