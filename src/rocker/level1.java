package rocker;
import java.util.*;
public class level1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入第一个数组的行和列：");
        int a = s.nextInt();
        int b = s.nextInt();
        int[][] one = new int[a][b];
        System.out.println("输入第一个数组:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                one[i][j] = s.nextInt();
            }
        }
        System.out.print("输入第二个数组的行和列：");
        int c = s.nextInt();
        int d = s.nextInt();
        int[][] two = new int[c][d];
        System.out.println("输入第二个数组:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                two[i][j] = s.nextInt();
            }
        }
        int[][] three = new int[a][d];
        if(b==c)
        {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                int result=0;
                for (int k = 0; k < b; k++) {
                    result += one[i][k] * two[k][j];
                }
                three[i][j] = result;
            }
        }
        System.out.println("输出第三个数组");
        for (int i = 0; i < a ;i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(three[i][j]+",");
                if(j==d-1){
                    System.out.println();
                }
            }
        }
    }
        else
        {
            System.out.println("输入错误b不等于c");
        }
    }
}
